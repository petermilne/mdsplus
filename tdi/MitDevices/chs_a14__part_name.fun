public fun CHS_A14__PART_NAME(as_is _nid, optional in _method)
{
  _name = ([
  '',
  ':NAME',
  ':COMMENT',
  ':CLOCK_DIVIDE',
  ':EXT_CLOCK_IN',
  ':STOP_TRIG',
  ':PTS',
  ':MODE',
  ':DIMENSION',
  ':CLK_POLARITY',
  ':STR_POLARITY',
  ':STP_POLARITY',
  ':GATED',
  ':INPUT_1',
  ':INPUT_1:STARTIDX',
  ':INPUT_1:ENDIDX',
  ':INPUT_2',
  ':INPUT_2:STARTIDX',
  ':INPUT_2:ENDIDX',
  ':INPUT_3',
  ':INPUT_3:STARTIDX',
  ':INPUT_3:ENDIDX',
  ':INPUT_4',
  ':INPUT_4:STARTIDX',
  ':INPUT_4:ENDIDX',
  ':INPUT_5',
  ':INPUT_5:STARTIDX',
  ':INPUT_5:ENDIDX',
  ':INPUT_6',
  ':INPUT_6:STARTIDX',
  ':INPUT_6:ENDIDX',
  ':INIT_ACTION',
  ':STORE_ACTION'])[getnci(_nid,'conglomerate_elt')-1];
  return(trim(_name));
}
