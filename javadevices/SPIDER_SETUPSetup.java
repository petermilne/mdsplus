/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SPIDERSetup.java
 *
 * Created on Feb 2, 2012, 2:19:27 PM
 */

/**
 *
 * @author manduchi
 */
public class SPIDER_SETUPSetup extends DeviceSetup {

    /** Creates new form SPIDERSetup */
    public SPIDER_SETUPSetup() {
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        deviceField18 = new DeviceField();
        jPanel30 = new javax.swing.JPanel();
        deviceField19 = new DeviceField();
        deviceField20 = new DeviceField();
        jPanel29 = new javax.swing.JPanel();
        deviceField13 = new DeviceField();
        deviceField17 = new DeviceField();
        jPanel17 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        deviceField4 = new DeviceField();
        deviceField5 = new DeviceField();
        deviceField6 = new DeviceField();
        jPanel5 = new javax.swing.JPanel();
        deviceField7 = new DeviceField();
        deviceField8 = new DeviceField();
        deviceField9 = new DeviceField();
        jPanel11 = new javax.swing.JPanel();
        deviceField14 = new DeviceField();
        deviceField15 = new DeviceField();
        deviceField16 = new DeviceField();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        deviceField10 = new DeviceField();
        deviceField11 = new DeviceField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        deviceWave1 = new DeviceWave();
        jPanel8 = new javax.swing.JPanel();
        deviceWave2 = new DeviceWave();
        jPanel9 = new javax.swing.JPanel();
        deviceWave3 = new DeviceWave();
        jPanel10 = new javax.swing.JPanel();
        deviceWave4 = new DeviceWave();
        jPanel13 = new javax.swing.JPanel();
        deviceWave6 = new DeviceWave();
        jPanel14 = new javax.swing.JPanel();
        deviceWave7 = new DeviceWave();
        jPanel15 = new javax.swing.JPanel();
        deviceWave8 = new DeviceWave();
        jPanel16 = new javax.swing.JPanel();
        deviceWave9 = new DeviceWave();
        jPanel12 = new javax.swing.JPanel();
        deviceWave5 = new DeviceWave();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        deviceField12 = new DeviceField();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel21 = new javax.swing.JPanel();
        deviceWave10 = new DeviceWave();
        jPanel22 = new javax.swing.JPanel();
        deviceWave11 = new DeviceWave();
        jPanel23 = new javax.swing.JPanel();
        deviceWave12 = new DeviceWave();
        jPanel24 = new javax.swing.JPanel();
        deviceWave13 = new DeviceWave();
        jPanel25 = new javax.swing.JPanel();
        deviceWave14 = new DeviceWave();
        jPanel26 = new javax.swing.JPanel();
        deviceWave15 = new DeviceWave();

        setDeviceProvider("localhost");
        setDeviceTitle("SPIDER Experiment Setup");
        setDeviceType("SPIDER_SETUP");
        setHeight(600);
        setWidth(1000);
        getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

        jPanel27.setLayout(new java.awt.BorderLayout());

        jPanel28.setLayout(new java.awt.GridLayout(4, 1));

        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder("Times"));

        deviceField18.setIdentifier("");
        deviceField18.setLabelString("T_START_SPIDER: ");
        deviceField18.setNumCols(30);
        deviceField18.setOffsetNid(119);
        jPanel31.add(deviceField18);

        jPanel28.add(jPanel31);

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder("Beam ON time Limit"));

        deviceField19.setIdentifier("");
        deviceField19.setLabelString("Start Time: ");
        deviceField19.setNumCols(30);
        deviceField19.setOffsetNid(120);
        jPanel30.add(deviceField19);

        deviceField20.setIdentifier("");
        deviceField20.setLabelString("End Time ");
        deviceField20.setNumCols(30);
        deviceField20.setOffsetNid(121);
        jPanel30.add(deviceField20);

        jPanel28.add(jPanel30);

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder("Reference Waveform Time Limit"));

        deviceField13.setIdentifier("");
        deviceField13.setLabelString("Start Time: ");
        deviceField13.setNumCols(30);
        deviceField13.setOffsetNid(122);
        jPanel29.add(deviceField13);

        deviceField17.setIdentifier("");
        deviceField17.setLabelString("End Time: ");
        deviceField17.setNumCols(30);
        deviceField17.setOffsetNid(123);
        jPanel29.add(deviceField17);

        jPanel28.add(jPanel29);

        jPanel27.add(jPanel28, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.addTab("SPIDER", jPanel27);

        jPanel17.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridLayout(4, 1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("CAEN DT5720 Timing"));

        deviceField4.setIdentifier("");
        deviceField4.setLabelString("Start Time: ");
        deviceField4.setNumCols(20);
        deviceField4.setOffsetNid(4);
        jPanel4.add(deviceField4);

        deviceField5.setIdentifier("");
        deviceField5.setLabelString("Duration: ");
        deviceField5.setNumCols(20);
        deviceField5.setOffsetNid(5);
        jPanel4.add(deviceField5);

        deviceField6.setIdentifier("");
        deviceField6.setLabelString("Frequency: ");
        deviceField6.setNumCols(20);
        deviceField6.setOffsetNid(3);
        jPanel4.add(deviceField6);

        jPanel1.add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("NI 6259 Timing"));

        deviceField7.setIdentifier("");
        deviceField7.setLabelString("Start Time: ");
        deviceField7.setNumCols(20);
        deviceField7.setOffsetNid(7);
        jPanel5.add(deviceField7);

        deviceField8.setIdentifier("");
        deviceField8.setLabelString("Duration");
        deviceField8.setNumCols(20);
        deviceField8.setOffsetNid(8);
        jPanel5.add(deviceField8);

        deviceField9.setIdentifier("");
        deviceField9.setLabelString("Frequency: ");
        deviceField9.setNumCols(20);
        deviceField9.setOffsetNid(6);
        jPanel5.add(deviceField9);

        jPanel1.add(jPanel5);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("NI 6368 Timing"));

        deviceField14.setIdentifier("");
        deviceField14.setLabelString("Start Time: ");
        deviceField14.setNumCols(20);
        deviceField14.setOffsetNid(10);
        jPanel11.add(deviceField14);

        deviceField15.setIdentifier("");
        deviceField15.setLabelString("Duration");
        deviceField15.setNumCols(20);
        deviceField15.setOffsetNid(11);
        jPanel11.add(deviceField15);

        deviceField16.setIdentifier("");
        deviceField16.setLabelString("Frequency: ");
        deviceField16.setNumCols(20);
        deviceField16.setOffsetNid(9);
        jPanel11.add(deviceField16);

        jPanel1.add(jPanel11);

        jTabbedPane3.addTab("Data Acquisition", jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Breakdown Management"));

        deviceField10.setIdentifier("");
        deviceField10.setLabelString("Dead time Time: ");
        deviceField10.setNumCols(20);
        deviceField10.setOffsetNid(12);
        jPanel6.add(deviceField10);

        deviceField11.setIdentifier("");
        deviceField11.setLabelString("Recover time: ");
        deviceField11.setNumCols(20);
        deviceField11.setOffsetNid(13);
        jPanel6.add(deviceField11);

        jPanel2.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setLayout(new java.awt.BorderLayout());

        deviceWave1.setIdentifier("");
        deviceWave1.setOffsetNid(15);
        deviceWave1.setUpdateExpression("");
        jPanel7.add(deviceWave1, java.awt.BorderLayout.CENTER);

        jTabbedPane2.addTab("BiasPlateI/VRef", jPanel7);

        jPanel8.setLayout(new java.awt.BorderLayout());

        deviceWave2.setIdentifier("");
        deviceWave2.setOffsetNid(21);
        deviceWave2.setUpdateExpression("");
        jPanel8.add(deviceWave2, java.awt.BorderLayout.CENTER);

        jTabbedPane2.addTab("ExtractionGridVRef", jPanel8);

        jPanel9.setLayout(new java.awt.BorderLayout());

        deviceWave3.setIdentifier("");
        deviceWave3.setOffsetNid(27);
        deviceWave3.setUpdateExpression("");
        jPanel9.add(deviceWave3, java.awt.BorderLayout.CENTER);

        jTabbedPane2.addTab("PlasmaGridIRef", jPanel9);

        jPanel10.setLayout(new java.awt.BorderLayout());

        deviceWave4.setIdentifier("");
        deviceWave4.setOffsetNid(33);
        deviceWave4.setUpdateExpression("");
        jPanel10.add(deviceWave4, java.awt.BorderLayout.CENTER);

        jTabbedPane2.addTab("RFPowerRef", jPanel10);

        jPanel13.setLayout(new java.awt.BorderLayout());

        deviceWave6.setIdentifier("");
        deviceWave6.setOffsetNid(39);
        deviceWave6.setUpdateExpression("");
        jPanel13.add(deviceWave6, java.awt.BorderLayout.CENTER);

        jTabbedPane2.addTab("BiasI/VRef", jPanel13);

        jPanel14.setLayout(new java.awt.BorderLayout());

        deviceWave7.setIdentifier("");
        deviceWave7.setOffsetNid(45);
        deviceWave7.setUpdateExpression("");
        jPanel14.add(deviceWave7, java.awt.BorderLayout.CENTER);

        jTabbedPane2.addTab("RF_FREQ", jPanel14);

        jPanel15.setLayout(new java.awt.BorderLayout());

        deviceWave8.setIdentifier("");
        deviceWave8.setOffsetNid(51);
        deviceWave8.setUpdateExpression("");
        jPanel15.add(deviceWave8, java.awt.BorderLayout.CENTER);

        jTabbedPane2.addTab("RF_PHY", jPanel15);

        jPanel16.setLayout(new java.awt.BorderLayout());

        deviceWave9.setIdentifier("");
        deviceWave9.setOffsetNid(57);
        deviceWave9.setUpdateExpression("");
        jPanel16.add(deviceWave9, java.awt.BorderLayout.CENTER);

        jTabbedPane2.addTab("RF_REFLECT", jPanel16);

        jPanel12.setLayout(new java.awt.BorderLayout());

        deviceWave5.setIdentifier("");
        deviceWave5.setOffsetNid(63);
        deviceWave5.setUpdateExpression("");
        jPanel12.add(deviceWave5, java.awt.BorderLayout.CENTER);

        jTabbedPane2.addTab("Recover Wave", jPanel12);

        jPanel2.add(jTabbedPane2, java.awt.BorderLayout.CENTER);

        jTabbedPane3.addTab("Waveforms", jPanel2);

        jPanel17.add(jTabbedPane3, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("ISEPS ", jPanel17);

        jPanel18.setLayout(new java.awt.BorderLayout());

        jPanel19.setLayout(new java.awt.BorderLayout());

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Gas And Vacuum Timing"));

        deviceField12.setIdentifier("");
        deviceField12.setLabelString("Trigger Source: ");
        deviceField12.setNumCols(30);
        deviceField12.setOffsetNid(69);
        jPanel20.add(deviceField12);

        jPanel19.add(jPanel20, java.awt.BorderLayout.PAGE_START);

        jPanel21.setLayout(new java.awt.BorderLayout());

        deviceWave10.setIdentifier("");
        deviceWave10.setOffsetNid(71);
        deviceWave10.setUpdateExpression("");
        jPanel21.add(deviceWave10, java.awt.BorderLayout.CENTER);

        jTabbedPane4.addTab("Wave 1", jPanel21);

        jPanel22.setLayout(new java.awt.BorderLayout());

        deviceWave11.setIdentifier("");
        deviceWave11.setOffsetNid(77);
        deviceWave11.setUpdateExpression("");
        jPanel22.add(deviceWave11, java.awt.BorderLayout.CENTER);

        jTabbedPane4.addTab("Wave 2", jPanel22);

        jPanel23.setLayout(new java.awt.BorderLayout());

        deviceWave12.setIdentifier("");
        deviceWave12.setOffsetNid(83);
        deviceWave12.setUpdateExpression("");
        jPanel23.add(deviceWave12, java.awt.BorderLayout.CENTER);

        jTabbedPane4.addTab("Wave 3", jPanel23);

        jPanel24.setLayout(new java.awt.BorderLayout());

        deviceWave13.setIdentifier("");
        deviceWave13.setOffsetNid(89);
        deviceWave13.setUpdateExpression("");
        jPanel24.add(deviceWave13, java.awt.BorderLayout.CENTER);

        jTabbedPane4.addTab("Wave 4", jPanel24);

        jPanel25.setLayout(new java.awt.BorderLayout());

        deviceWave14.setIdentifier("");
        deviceWave14.setOffsetNid(95);
        deviceWave14.setUpdateExpression("");
        jPanel25.add(deviceWave14, java.awt.BorderLayout.CENTER);

        jTabbedPane4.addTab("Wave 5", jPanel25);

        jPanel26.setLayout(new java.awt.BorderLayout());

        deviceWave15.setIdentifier("");
        deviceWave15.setOffsetNid(101);
        deviceWave15.setUpdateExpression("");
        jPanel26.add(deviceWave15, java.awt.BorderLayout.CENTER);

        jTabbedPane4.addTab("Wave 6", jPanel26);

        jPanel19.add(jTabbedPane4, java.awt.BorderLayout.CENTER);

        jPanel18.add(jPanel19, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("GVS", jPanel18);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceField deviceField10;
    private DeviceField deviceField11;
    private DeviceField deviceField12;
    private DeviceField deviceField13;
    private DeviceField deviceField14;
    private DeviceField deviceField15;
    private DeviceField deviceField16;
    private DeviceField deviceField17;
    private DeviceField deviceField18;
    private DeviceField deviceField19;
    private DeviceField deviceField20;
    private DeviceField deviceField4;
    private DeviceField deviceField5;
    private DeviceField deviceField6;
    private DeviceField deviceField7;
    private DeviceField deviceField8;
    private DeviceField deviceField9;
    private DeviceWave deviceWave1;
    private DeviceWave deviceWave10;
    private DeviceWave deviceWave11;
    private DeviceWave deviceWave12;
    private DeviceWave deviceWave13;
    private DeviceWave deviceWave14;
    private DeviceWave deviceWave15;
    private DeviceWave deviceWave2;
    private DeviceWave deviceWave3;
    private DeviceWave deviceWave4;
    private DeviceWave deviceWave5;
    private DeviceWave deviceWave6;
    private DeviceWave deviceWave7;
    private DeviceWave deviceWave8;
    private DeviceWave deviceWave9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    // End of variables declaration//GEN-END:variables

}
