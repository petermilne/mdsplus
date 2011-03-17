#include <config.h>
#include <process.h>
#include <stdio.h>
#include <io.h>
#include <fcntl.h>
#include "mdsip_connections.h"

static int shut=0;
static HANDLE shutdownEventHandle;

static char *ServiceName() {
  static char name[512] = {0};
  strcpy(name,"MDSIP_");
  strcat(name,GetPortname());
  return name;
}

static int SpawnWorker(SOCKET sock) {
  int status;
  STARTUPINFO startupinfo;
  PROCESS_INFORMATION pinfo;
  char cmd[1024];
  SECURITY_ATTRIBUTES sc_atts;
  char *pgm,*lslash;
  _get_pgmptr(&pgm);
  lslash=strrchr(pgm,'\\');
  sc_atts.nLength=sizeof(sc_atts);
  sc_atts.bInheritHandle=TRUE;
  sc_atts.lpSecurityDescriptor=NULL;
  sprintf(cmd,"%.*s\\mdsip.exe -p %s -h %s -c %d -S %d %d",lslash-pgm,pgm,
	  GetPortname(),GetHostfile(),GetMaxCompressionLevel(),_getpid(),sock);
  memset(&startupinfo,0,sizeof(startupinfo));
  startupinfo.cb = sizeof(startupinfo);
  status = CreateProcess(NULL,cmd,NULL,NULL,FALSE,0,NULL,NULL,&startupinfo, &pinfo);
  printf("CreateProcess returned %d with cmd=%s\n",status,cmd);
  fflush(stdout);
  CloseHandle(pinfo.hProcess);
  CloseHandle(pinfo.hThread);
  return pinfo.dwProcessId;
}

static SERVICE_STATUS_HANDLE hService;
int ServiceMain(int,char**);
static SERVICE_STATUS serviceStatus;

static void SetThisServiceStatus(int state,int hint) {
  serviceStatus.dwServiceType = SERVICE_WIN32_OWN_PROCESS;
  serviceStatus.dwCurrentState = state;
  serviceStatus.dwControlsAccepted = SERVICE_ACCEPT_STOP;
  serviceStatus.dwWin32ExitCode = NO_ERROR;
  serviceStatus.dwServiceSpecificExitCode = 0;
  serviceStatus.dwCheckPoint = 0;
  serviceStatus.dwWaitHint = hint;
  SetServiceStatus(hService,&serviceStatus);
}

VOID WINAPI serviceHandler(DWORD fdwControl) {
  switch (fdwControl) {
  case SERVICE_CONTROL_STOP:
  {
	SetThisServiceStatus(SERVICE_STOP_PENDING,1000);
	SetThisServiceStatus(SERVICE_STOPPED,0);
	shut = 1;
	PulseEvent(shutdownEventHandle);
    break;
  }
  }
}


static void InitializeService() {
  char name[120];
  hService = RegisterServiceCtrlHandler(ServiceName(),(LPHANDLER_FUNCTION) serviceHandler);
  sprintf(name,"MDSIP_%s_SHUTDOWN",GetPortname());
  shutdownEventHandle=CreateEvent(NULL,FALSE,FALSE,name);
  SetThisServiceStatus(SERVICE_START_PENDING,1000);
}

static void RemoveService() {
  SC_HANDLE hSCManager = OpenSCManager(NULL,NULL,SC_MANAGER_CREATE_SERVICE); 
  if (hSCManager) {
    SC_HANDLE hService = OpenService(hSCManager, ServiceName(), DELETE);
    if (hService) {
      BOOL status;
      status = DeleteService(hService);
      status = CloseServiceHandle(hService);
    }
    CloseServiceHandle(hSCManager);
  }
}

static void InstallService() {
  SC_HANDLE hSCManager;
  int status;
  RemoveService();
  hSCManager = OpenSCManager(NULL,NULL,SC_MANAGER_CREATE_SERVICE);
  if (hSCManager) {
    SC_HANDLE hService;
	char *pgm;
    char *cmd;
	unsigned char mode = GetMode();
	_get_pgmptr(&pgm);
	cmd = (char *)malloc(strlen(pgm)+strlen(GetPortname())+strlen(GetHostfile())+100);
	sprintf(cmd,"%s -p %s -h \"%s\" %s",pgm,GetPortname(),GetHostfile(),mode == 'i' ? "" : (mode == 'M' ? "-m" : "-s"));
    hService = CreateService(hSCManager, ServiceName(), ServiceName(), 0, SERVICE_WIN32_OWN_PROCESS,
            SERVICE_AUTO_START, SERVICE_ERROR_NORMAL, cmd, NULL, NULL, NULL, NULL, NULL);
    if (hService == NULL)
      status = GetLastError();
    free(cmd);
    if (hService)
      CloseServiceHandle(hService);
    CloseServiceHandle(hSCManager);
  }
}

static void InitializeSockets() {
  WSADATA wsaData;
  WORD wVersionRequested;
  wVersionRequested = MAKEWORD(1,1);
  WSAStartup(wVersionRequested,&wsaData);
}

static short GetPort() {
  short port;
  char *name=GetPortname();
  struct servent *sp;
  port = htons((short)atoi(name));
  if (port == 0) {
    sp = getservbyname(name,"tcp");
    if (sp == NULL) {
      fprintf(stderr,"unknown service: %s/tcp\n\n",name);
      exit(0);
    }
    port = sp->s_port;
  }
  return port;
}

static void RedirectOutput(){
	char file[120];
	sprintf(file,"C:\\MDSIP_%s.log",GetPortname());
	freopen(file,"w",stdout);
	freopen(file,"a",stderr);
}

static int ServiceMain(int argc, char **argv) {
  SOCKET s;
  int status;
  static struct sockaddr_in sin;
  int tablesize = FD_SETSIZE;
  extern fd_set FdActive();
  struct timeval timeout = {1,0};
  int error_count=0;
  fd_set readfds;
  fd_set fdactive;
  RedirectOutput();
  InitializeService();
  SetThisServiceStatus(SERVICE_RUNNING,0);
  if (GetMulti()) {
    IoRoutines *io;
    io=LoadIo(GetProtocol());
    if (io && io->listen)
      io->listen(argc,argv);
    else {
      fprintf(stderr,"Protocol %s does not support servers\n",GetProtocol());
      return 1;
    }
    return 0;
  } else {
    s = socket(AF_INET, SOCK_STREAM, 0);
    if (s == -1) {
      printf("Error getting Connection Socket\n");
      exit(1);
    }
    memset(&sin,0,sizeof(sin));
    sin.sin_port = GetPort();
    sin.sin_family = AF_INET;
    sin.sin_addr.s_addr = INADDR_ANY;
    status = bind(s, (struct sockaddr *)&sin, sizeof(struct sockaddr_in));
    if (status < 0)  {
      perror("Error binding to service\n");
      exit(1);
    }
    status = listen(s,128);
    if (status < 0)  {
      perror("Error listen on port\n");
      exit(1);
    }
    FD_ZERO(&fdactive);
    FD_SET(s,&fdactive);
    for (readfds=fdactive;!shut;readfds=fdactive) {
      int sstatus;
      if ((sstatus = select(tablesize, &readfds, 0, 0, &timeout)) != SOCKET_ERROR) {
        error_count=0;
        if (FD_ISSET(s, &readfds)){
		  int len = sizeof(struct sockaddr_in);
		  SOCKET sock = accept(s, (struct sockaddr *)&sin, &len);
		  SpawnWorker(sock);
        }
      } else {
        error_count++;
        perror("error in main select");
        fprintf(stderr,"Error count=%d\n",error_count);
	    fflush(stderr);
        if (error_count > 100) {
          fprintf(stderr,"Error count exceeded, shutting down\n");
          shut=1;
        }
	  }
    }
    shutdown(s,2);
    return 1;
  }
}

int main( int argc, char **argv) {
  unsigned char mode;
//  DebugBreak();
  ParseCommand(argc, argv);
  mode=GetMode();
  if (mode == 'r') {
	RemoveService();
	exit(0);
  } else if (mode == 'i' || mode == 'M' || mode == 'S') {
	InstallService();
	exit(0);
  } else {
    SERVICE_TABLE_ENTRY srvcTable[] = {{ServiceName(),(LPSERVICE_MAIN_FUNCTION)ServiceMain},{NULL,NULL}};
    WSADATA wsaData;
    WORD wVersionRequested;
    wVersionRequested = MAKEWORD(1,1);
    WSAStartup(wVersionRequested,&wsaData);
    StartServiceCtrlDispatcher(srvcTable);
  }
  return 1;
}
