/*
 * RFXDiagTimesSetup.java
 *
 * Created on March 19, 2007, 12:54 PM
 */

/**
 *
 * @author  taliercio
 */
public class RFXDiagTimesSetup  extends DeviceSetup {

    /** Creates new form RFXDiagTimesSetup */
    public RFXDiagTimesSetup() {
	initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
	jPanel3 = new javax.swing.JPanel();
	deviceButtons1 = new DeviceButtons();
	jPanel1 = new javax.swing.JPanel();
	jPanel2 = new javax.swing.JPanel();
	jPanel4 = new javax.swing.JPanel();
	deviceField1 = new DeviceField();
	deviceField3 = new DeviceField();

	setDeviceProvider("localhost");
	setDeviceTitle("RFX diagnostic timing setup");
	setDeviceType("RFXDiagTimes");
	deviceButtons1.setCheckExpressions(new String[] {"( _nd_period >=  0.025 &&  _nd_period <= 0.1)", "( _nd_trigger >=  -0.025 &&  _nd_trigger <=  0.05) ", "if(_nd_trigger_state == 1) tcl(\'set node \\\\RFX::STC_DIAG_DIO2_1.CHANNEL_4/on\'); else tcl(\'set "+"node \\\\RFX::STC_DIAG_DIO2_1.CHANNEL_4 /off\'); 1;", "if(_nd_trigger_state == 1) tcl(\'set node \\\\RFX::STC_DIAG_DIO2_1.CHANNEL_3/on\'); else tcl(\'set "+"node \\\\RFX::STC_DIAG_DIO2_1.CHANNEL_3 /off\'); 1;"});
	deviceButtons1.setCheckMessages(new String[] {"Error Neodimium period time :  0.025 - 0.1", "Error Neodimium trigger time :  -0.025 - 0.05", "Check state", "Check state"});
	jPanel3.add(deviceButtons1);

	getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

	jPanel1.setLayout(new java.awt.GridLayout(1, 1));

	jPanel2.setLayout(new java.awt.GridLayout(1, 1));

	jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thomson scattering"));
	jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

	deviceField1.setIdentifier("nd_trigger");
	deviceField1.setLabelString("Trigger Time:");
	deviceField1.setOffsetNid(1);
	deviceField1.setShowState(true);
	jPanel4.add(deviceField1);

	deviceField3.setIdentifier("nd_period");
	deviceField3.setLabelString("Period : ");
	deviceField3.setOffsetNid(2);
	jPanel4.add(deviceField3);

	jPanel2.add(jPanel4);

	jPanel1.add(jPanel2);
	jPanel2.getAccessibleContext().setAccessibleName(null);

	getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

	pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
	        new RFXDiagTimesSetup().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceField deviceField1;
    private DeviceField deviceField3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

}
