/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SIS3820Setup.java
 *
 * Created on 27-nov-2009, 17.37.26
 */

/**
 *
 * @author Zampiva
 */
public class SIS3820Setup extends DeviceSetup {

    /** Creates new form BeanForm */
    public SIS3820Setup() {
	initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

	deviceButtons1 = new DeviceButtons();
	jPanel1 = new javax.swing.JPanel();
	jPanel2 = new javax.swing.JPanel();
	deviceField1 = new DeviceField();
	deviceField2 = new DeviceField();
	deviceField3 = new DeviceField();
	deviceDispatch1 = new DeviceDispatch();
	jPanel3 = new javax.swing.JPanel();
	deviceChoice1 = new DeviceChoice();
	deviceChoice2 = new DeviceChoice();
	deviceField4 = new DeviceField();
	deviceField5 = new DeviceField();
	jScrollPane1 = new javax.swing.JScrollPane();
	jPanel4 = new javax.swing.JPanel();
	deviceChannel1 = new DeviceChannel();
	deviceChannel2 = new DeviceChannel();
	deviceChannel3 = new DeviceChannel();
	deviceChannel4 = new DeviceChannel();
	deviceChannel5 = new DeviceChannel();
	deviceChannel6 = new DeviceChannel();
	deviceChannel7 = new DeviceChannel();
	deviceChannel8 = new DeviceChannel();
	deviceChannel9 = new DeviceChannel();
	deviceChannel10 = new DeviceChannel();
	deviceChannel11 = new DeviceChannel();
	deviceChannel12 = new DeviceChannel();
	deviceChannel13 = new DeviceChannel();
	deviceChannel14 = new DeviceChannel();
	deviceChannel15 = new DeviceChannel();
	deviceChannel16 = new DeviceChannel();
	deviceChannel17 = new DeviceChannel();
	deviceChannel18 = new DeviceChannel();
	deviceChannel19 = new DeviceChannel();
	deviceChannel20 = new DeviceChannel();
	deviceChannel21 = new DeviceChannel();
	deviceChannel22 = new DeviceChannel();
	deviceChannel23 = new DeviceChannel();
	deviceChannel24 = new DeviceChannel();
	deviceChannel25 = new DeviceChannel();
	deviceChannel26 = new DeviceChannel();
	deviceChannel27 = new DeviceChannel();
	deviceChannel28 = new DeviceChannel();
	deviceChannel29 = new DeviceChannel();
	deviceChannel30 = new DeviceChannel();
	deviceChannel31 = new DeviceChannel();
	deviceChannel32 = new DeviceChannel();

	setDeviceProvider("localhost");
	setDeviceTitle("SIS3820 Scaler");
	setDeviceType("SIS3820");
	setHeight(600);
	setWidth(1000);

	deviceButtons1.setCheckExpressions(new String[] {});
	deviceButtons1.setCheckMessages(new String[] {});
	deviceButtons1.setMethods(new String[] {"INIT", "ARM", "STORE"});
	getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

	jPanel1.setMinimumSize(new java.awt.Dimension(458, 162));
	jPanel1.setPreferredSize(new java.awt.Dimension(704, 200));
	jPanel1.setLayout(new java.awt.GridLayout(2, 1));

	jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("BOARD SETUP"));
	jPanel2.setMinimumSize(new java.awt.Dimension(427, 20));
	jPanel2.setPreferredSize(new java.awt.Dimension(704, 30));
	jPanel2.setRequestFocusEnabled(false);

	deviceField1.setIdentifier("");
	deviceField1.setLabelString("VME IP Addr:");
	deviceField1.setOffsetNid(3);
	deviceField1.setTextOnly(true);
	jPanel2.add(deviceField1);

	deviceField2.setIdentifier("");
	deviceField2.setLabelString("Base Addr:");
	deviceField2.setNumCols(4);
	deviceField2.setOffsetNid(1);
	jPanel2.add(deviceField2);

	deviceField3.setIdentifier("");
	deviceField3.setLabelString("Comment:");
	deviceField3.setNumCols(20);
	deviceField3.setOffsetNid(2);
	deviceField3.setTextOnly(true);
	jPanel2.add(deviceField3);
	jPanel2.add(deviceDispatch1);

	jPanel1.add(jPanel2);

	jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("ACQ SETUP"));
	jPanel3.setMinimumSize(new java.awt.Dimension(535, 50));
	jPanel3.setPreferredSize(new java.awt.Dimension(577, 50));

	deviceChoice1.setChoiceItems(new String[] {"SCALER", "MULTI CHANNEL SCALER", "VME FIFO WRITE"});
	deviceChoice1.setIdentifier("");
	deviceChoice1.setLabelString("OP  Mode:");
	deviceChoice1.setOffsetNid(4);
	deviceChoice1.setUpdateIdentifier("");
	jPanel3.add(deviceChoice1);

	deviceChoice2.setChoiceItems(new String[] {"VME", "CONTROL SIGNAL", "INTERNAL 10MHZ", "CHANNEL N", "PRESET"});
	deviceChoice2.setIdentifier("");
	deviceChoice2.setLabelString("LNE Mode");
	deviceChoice2.setOffsetNid(5);
	deviceChoice2.setUpdateIdentifier("");
	jPanel3.add(deviceChoice2);

	deviceField4.setIdentifier("");
	deviceField4.setLabelString("LNE Source");
	deviceField4.setNumCols(20);
	deviceField4.setOffsetNid(6);
	jPanel3.add(deviceField4);

	deviceField5.setIdentifier("");
	deviceField5.setLabelString("Scan Count:");
	deviceField5.setNumCols(4);
	deviceField5.setOffsetNid(7);
	jPanel3.add(deviceField5);

	jPanel1.add(jPanel3);

	getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);
	jPanel1.getAccessibleContext().setAccessibleName("");

	jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("CHANNELS SETUP"));

	jPanel4.setLayout(new java.awt.GridLayout(8, 4));

	deviceChannel1.setBorderVisible(true);
	deviceChannel1.setInSameLine(true);
	deviceChannel1.setLabelString("Channel 00:");
	deviceChannel1.setOffsetNid(8);
	deviceChannel1.setShowVal("");
	deviceChannel1.setUpdateIdentifier("");
	jPanel4.add(deviceChannel1);

	deviceChannel2.setBorderVisible(true);
	deviceChannel2.setInSameLine(true);
	deviceChannel2.setLabelString("Channel 01:");
	deviceChannel2.setOffsetNid(10);
	deviceChannel2.setShowVal("");
	deviceChannel2.setUpdateIdentifier("");
	jPanel4.add(deviceChannel2);

	deviceChannel3.setBorderVisible(true);
	deviceChannel3.setInSameLine(true);
	deviceChannel3.setLabelString("Channel 02:");
	deviceChannel3.setOffsetNid(12);
	deviceChannel3.setShowVal("");
	deviceChannel3.setUpdateIdentifier("");
	jPanel4.add(deviceChannel3);

	deviceChannel4.setBorderVisible(true);
	deviceChannel4.setInSameLine(true);
	deviceChannel4.setLabelString("Channel 03:");
	deviceChannel4.setOffsetNid(14);
	deviceChannel4.setShowVal("");
	deviceChannel4.setUpdateIdentifier("");
	jPanel4.add(deviceChannel4);

	deviceChannel5.setBorderVisible(true);
	deviceChannel5.setInSameLine(true);
	deviceChannel5.setLabelString("Channel 04:");
	deviceChannel5.setOffsetNid(16);
	deviceChannel5.setShowVal("");
	deviceChannel5.setUpdateIdentifier("");
	jPanel4.add(deviceChannel5);

	deviceChannel6.setBorderVisible(true);
	deviceChannel6.setInSameLine(true);
	deviceChannel6.setLabelString("Channel 05:");
	deviceChannel6.setOffsetNid(18);
	deviceChannel6.setShowVal("");
	deviceChannel6.setUpdateIdentifier("");
	jPanel4.add(deviceChannel6);

	deviceChannel7.setBorderVisible(true);
	deviceChannel7.setInSameLine(true);
	deviceChannel7.setLabelString("Channel 06:");
	deviceChannel7.setOffsetNid(20);
	deviceChannel7.setShowVal("");
	deviceChannel7.setUpdateIdentifier("");
	jPanel4.add(deviceChannel7);

	deviceChannel8.setBorderVisible(true);
	deviceChannel8.setInSameLine(true);
	deviceChannel8.setLabelString("Channel 07:");
	deviceChannel8.setOffsetNid(22);
	deviceChannel8.setShowVal("");
	deviceChannel8.setUpdateIdentifier("");
	jPanel4.add(deviceChannel8);

	deviceChannel9.setBorderVisible(true);
	deviceChannel9.setInSameLine(true);
	deviceChannel9.setLabelString("Channel 08:");
	deviceChannel9.setOffsetNid(24);
	deviceChannel9.setShowVal("");
	deviceChannel9.setUpdateIdentifier("");
	jPanel4.add(deviceChannel9);

	deviceChannel10.setBorderVisible(true);
	deviceChannel10.setInSameLine(true);
	deviceChannel10.setLabelString("Channel 09:");
	deviceChannel10.setOffsetNid(26);
	deviceChannel10.setShowVal("");
	deviceChannel10.setUpdateIdentifier("");
	jPanel4.add(deviceChannel10);

	deviceChannel11.setBorderVisible(true);
	deviceChannel11.setInSameLine(true);
	deviceChannel11.setLabelString("Channel 10:");
	deviceChannel11.setOffsetNid(28);
	deviceChannel11.setShowVal("");
	deviceChannel11.setUpdateIdentifier("");
	jPanel4.add(deviceChannel11);

	deviceChannel12.setBorderVisible(true);
	deviceChannel12.setInSameLine(true);
	deviceChannel12.setLabelString("Channel 11:");
	deviceChannel12.setOffsetNid(30);
	deviceChannel12.setShowVal("");
	deviceChannel12.setUpdateIdentifier("");
	jPanel4.add(deviceChannel12);

	deviceChannel13.setBorderVisible(true);
	deviceChannel13.setInSameLine(true);
	deviceChannel13.setLabelString("Channel 12:");
	deviceChannel13.setOffsetNid(32);
	deviceChannel13.setShowVal("");
	deviceChannel13.setUpdateIdentifier("");
	jPanel4.add(deviceChannel13);

	deviceChannel14.setBorderVisible(true);
	deviceChannel14.setInSameLine(true);
	deviceChannel14.setLabelString("Channel 13:");
	deviceChannel14.setOffsetNid(34);
	deviceChannel14.setShowVal("");
	deviceChannel14.setUpdateIdentifier("");
	jPanel4.add(deviceChannel14);

	deviceChannel15.setBorderVisible(true);
	deviceChannel15.setInSameLine(true);
	deviceChannel15.setLabelString("Channel 14:");
	deviceChannel15.setOffsetNid(36);
	deviceChannel15.setShowVal("");
	deviceChannel15.setUpdateIdentifier("");
	jPanel4.add(deviceChannel15);

	deviceChannel16.setBorderVisible(true);
	deviceChannel16.setInSameLine(true);
	deviceChannel16.setLabelString("Channel 15:");
	deviceChannel16.setOffsetNid(38);
	deviceChannel16.setShowVal("");
	deviceChannel16.setUpdateIdentifier("");
	jPanel4.add(deviceChannel16);

	deviceChannel17.setBorderVisible(true);
	deviceChannel17.setInSameLine(true);
	deviceChannel17.setLabelString("Channel 16:");
	deviceChannel17.setOffsetNid(40);
	deviceChannel17.setShowVal("");
	deviceChannel17.setUpdateIdentifier("");
	jPanel4.add(deviceChannel17);

	deviceChannel18.setBorderVisible(true);
	deviceChannel18.setInSameLine(true);
	deviceChannel18.setLabelString("Channel 17:");
	deviceChannel18.setOffsetNid(42);
	deviceChannel18.setShowVal("");
	deviceChannel18.setUpdateIdentifier("");
	jPanel4.add(deviceChannel18);

	deviceChannel19.setBorderVisible(true);
	deviceChannel19.setInSameLine(true);
	deviceChannel19.setLabelString("Channel 18:");
	deviceChannel19.setOffsetNid(44);
	deviceChannel19.setShowVal("");
	deviceChannel19.setUpdateIdentifier("");
	jPanel4.add(deviceChannel19);

	deviceChannel20.setBorderVisible(true);
	deviceChannel20.setInSameLine(true);
	deviceChannel20.setLabelString("Channel 19:");
	deviceChannel20.setOffsetNid(46);
	deviceChannel20.setShowVal("");
	deviceChannel20.setUpdateIdentifier("");
	jPanel4.add(deviceChannel20);

	deviceChannel21.setBorderVisible(true);
	deviceChannel21.setInSameLine(true);
	deviceChannel21.setLabelString("Channel 20:");
	deviceChannel21.setOffsetNid(48);
	deviceChannel21.setShowVal("");
	deviceChannel21.setUpdateIdentifier("");
	jPanel4.add(deviceChannel21);

	deviceChannel22.setBorderVisible(true);
	deviceChannel22.setInSameLine(true);
	deviceChannel22.setLabelString("Channel 21:");
	deviceChannel22.setOffsetNid(50);
	deviceChannel22.setShowVal("");
	deviceChannel22.setUpdateIdentifier("");
	jPanel4.add(deviceChannel22);

	deviceChannel23.setBorderVisible(true);
	deviceChannel23.setInSameLine(true);
	deviceChannel23.setLabelString("Channel 22:");
	deviceChannel23.setOffsetNid(52);
	deviceChannel23.setShowVal("");
	deviceChannel23.setUpdateIdentifier("");
	jPanel4.add(deviceChannel23);

	deviceChannel24.setBorderVisible(true);
	deviceChannel24.setInSameLine(true);
	deviceChannel24.setLabelString("Channel 23:");
	deviceChannel24.setOffsetNid(54);
	deviceChannel24.setShowVal("");
	deviceChannel24.setUpdateIdentifier("");
	jPanel4.add(deviceChannel24);

	deviceChannel25.setBorderVisible(true);
	deviceChannel25.setInSameLine(true);
	deviceChannel25.setLabelString("Channel 24:");
	deviceChannel25.setOffsetNid(56);
	deviceChannel25.setShowVal("");
	deviceChannel25.setUpdateIdentifier("");
	jPanel4.add(deviceChannel25);

	deviceChannel26.setBorderVisible(true);
	deviceChannel26.setInSameLine(true);
	deviceChannel26.setLabelString("Channel 25:");
	deviceChannel26.setOffsetNid(58);
	deviceChannel26.setShowVal("");
	deviceChannel26.setUpdateIdentifier("");
	jPanel4.add(deviceChannel26);

	deviceChannel27.setBorderVisible(true);
	deviceChannel27.setInSameLine(true);
	deviceChannel27.setLabelString("Channel 26:");
	deviceChannel27.setOffsetNid(60);
	deviceChannel27.setShowVal("");
	deviceChannel27.setUpdateIdentifier("");
	jPanel4.add(deviceChannel27);

	deviceChannel28.setBorderVisible(true);
	deviceChannel28.setInSameLine(true);
	deviceChannel28.setLabelString("Channel 27:");
	deviceChannel28.setOffsetNid(62);
	deviceChannel28.setShowVal("");
	deviceChannel28.setUpdateIdentifier("");
	jPanel4.add(deviceChannel28);

	deviceChannel29.setBorderVisible(true);
	deviceChannel29.setInSameLine(true);
	deviceChannel29.setLabelString("Channel 28:");
	deviceChannel29.setOffsetNid(64);
	deviceChannel29.setShowVal("");
	deviceChannel29.setUpdateIdentifier("");
	jPanel4.add(deviceChannel29);

	deviceChannel30.setBorderVisible(true);
	deviceChannel30.setInSameLine(true);
	deviceChannel30.setLabelString("Channel 29:");
	deviceChannel30.setOffsetNid(66);
	deviceChannel30.setShowVal("");
	deviceChannel30.setUpdateIdentifier("");
	jPanel4.add(deviceChannel30);

	deviceChannel31.setBorderVisible(true);
	deviceChannel31.setInSameLine(true);
	deviceChannel31.setLabelString("Channel 30:");
	deviceChannel31.setOffsetNid(68);
	deviceChannel31.setShowVal("");
	deviceChannel31.setUpdateIdentifier("");
	jPanel4.add(deviceChannel31);

	deviceChannel32.setBorderVisible(true);
	deviceChannel32.setInSameLine(true);
	deviceChannel32.setLabelString("Channel 31:");
	deviceChannel32.setOffsetNid(70);
	deviceChannel32.setShowVal("");
	deviceChannel32.setUpdateIdentifier("");
	jPanel4.add(deviceChannel32);

	jScrollPane1.setViewportView(jPanel4);
	jPanel4.getAccessibleContext().setAccessibleName("");

	getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
	jScrollPane1.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceChannel deviceChannel1;
    private DeviceChannel deviceChannel10;
    private DeviceChannel deviceChannel11;
    private DeviceChannel deviceChannel12;
    private DeviceChannel deviceChannel13;
    private DeviceChannel deviceChannel14;
    private DeviceChannel deviceChannel15;
    private DeviceChannel deviceChannel16;
    private DeviceChannel deviceChannel17;
    private DeviceChannel deviceChannel18;
    private DeviceChannel deviceChannel19;
    private DeviceChannel deviceChannel2;
    private DeviceChannel deviceChannel20;
    private DeviceChannel deviceChannel21;
    private DeviceChannel deviceChannel22;
    private DeviceChannel deviceChannel23;
    private DeviceChannel deviceChannel24;
    private DeviceChannel deviceChannel25;
    private DeviceChannel deviceChannel26;
    private DeviceChannel deviceChannel27;
    private DeviceChannel deviceChannel28;
    private DeviceChannel deviceChannel29;
    private DeviceChannel deviceChannel3;
    private DeviceChannel deviceChannel30;
    private DeviceChannel deviceChannel31;
    private DeviceChannel deviceChannel32;
    private DeviceChannel deviceChannel4;
    private DeviceChannel deviceChannel5;
    private DeviceChannel deviceChannel6;
    private DeviceChannel deviceChannel7;
    private DeviceChannel deviceChannel8;
    private DeviceChannel deviceChannel9;
    private DeviceChoice deviceChoice1;
    private DeviceChoice deviceChoice2;
    private DeviceDispatch deviceDispatch1;
    private DeviceField deviceField1;
    private DeviceField deviceField2;
    private DeviceField deviceField3;
    private DeviceField deviceField4;
    private DeviceField deviceField5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
