/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Service.Healthcamp;

import Models.HealthcampRequests;
import Models.PatientReports;
import Controller.HealthcampController;
import Controller.PatientReportController;
import Controller.PharmacyRequestsController;
import UI.Login;
import UI.Login;
import UI.PatientReport;
import UI.PatientReport;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author saideepak
 */
public class HealthcampDoctor extends javax.swing.JFrame {

    /**
     * Creates new form TransportMain
     */
    private String username;
    private PatientReportController patientReportController;
    private PharmacyRequestsController pharmacyRequestsController;
    private HealthcampController healthcampController;
    DefaultListModel<String> model2;
    DefaultTableModel model;
    static Logger log = Logger.getLogger(HealthcampDoctor.class.getName());
    
    public HealthcampDoctor(){
        initComponents();
    }
    
    public void populateTable(String doctorAssigned){
        model = (DefaultTableModel) tblTransport.getModel();
        model.setRowCount(0);
        ArrayList<HealthcampRequests> hrr = healthcampController.getHealthcampRequests(doctorAssigned);
        for(HealthcampRequests hr: hrr){
            Object row[] = new Object[6];
            row[0] = hr.getHospitalName();
            row[1] = hr.getPatientName();
            row[2] = hr.getReportDate();
            row[3] = hr.getStatus();
            row[4] = hr.getHealthcampName();
            row[5] = hr.getDoctorAssigned();
            model.addRow(row);
        }
    }

    public HealthcampDoctor(String DBUsername) {
        initComponents();
        patientReportController = new PatientReportController();
        healthcampController = new HealthcampController();
        pharmacyRequestsController = new PharmacyRequestsController();
        this.username = DBUsername;
        jList1.setModel(new DefaultListModel<>());
        populateTable(DBUsername);
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fp?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Deepak@1999");
//            Statement myStatement = con.createStatement();
//            String query = "select * from healthcamp_requests where doctor_assigned = '" + DBUsername + "'";
//            ResultSet rs = myStatement.executeQuery(query);
//            System.out.println(rs.getFetchSize());
//            //System.out.println("Inserted data");
//
//            while (rs.next()) {
//                String hospital_name = rs.getString("hospital_name");
//                String patient_name = rs.getString("patient_name");
//                String report_date = rs.getString("report_date");
//                String status = rs.getString("status");
//                String healthcamp_name = rs.getString("healthcamp_name");
//                String doctor_assigned = rs.getString("doctor_assigned");
//
//                Object row[] = new Object[6];
//                row[0] = hospital_name;
//                row[1] = patient_name;
//                row[2] = report_date;
//                row[3] = status;
//                row[4] = healthcamp_name;
//                row[5] = doctor_assigned;
//                model.addRow(row);
//
//            }
            
//            String query1 = "select name from organization where enterprise = 'Service' and type = 'Healthcamp' and name like 'Doc%'";
//            ResultSet rs1 = myStatement.executeQuery(query1);
//            jComboBox1.removeAllItems();
//            while (rs1.next()) {
//                jComboBox1.addItem(rs1.getString("name"));
//            }
//            con.close();
//        } catch (Exception E) {
//            JOptionPane.showMessageDialog(this, E + "....Error in DB call");
//        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        RightPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransport = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnApprove = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        btnApprove1 = new javax.swing.JButton();
        btnApprove2 = new javax.swing.JButton();
        btnApprove3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));

        jButton1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("VIEW REQUEST");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 102, 0));
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 618, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(73, 73, 73))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        RightPanel.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(222, 242, 218));

        tblTransport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Hospital Name", "Patient Name", "Report Date", "Status", "Healthcamp Name", "Doctor Assigned"
            }
        ));
        tblTransport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTransportMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTransport);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ASSIGNED PATIENTS");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acebutolol (Sectral)", "Atenolol (Tenormin)", "Betaxolol (Kerlone)", "Bisoprolol (Zebeta)", "Nadolol (Corgard)", "Acetaminophen", "Muscle relaxants." }));

        btnApprove.setBackground(new java.awt.Color(0, 102, 0));
        btnApprove.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("ADD MEDICATION");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        jLabel2.setText("LIST OF MEDICATION ADDED");

        btnApprove1.setBackground(new java.awt.Color(0, 102, 0));
        btnApprove1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        btnApprove1.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove1.setText("SUBMIT");
        btnApprove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprove1ActionPerformed(evt);
            }
        });

        btnApprove2.setBackground(new java.awt.Color(0, 102, 0));
        btnApprove2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        btnApprove2.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove2.setText("VIEW REPORT");
        btnApprove2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprove2ActionPerformed(evt);
            }
        });

        btnApprove3.setBackground(new java.awt.Color(0, 102, 0));
        btnApprove3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        btnApprove3.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove3.setText("NOTIFY PHARMACY");
        btnApprove3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprove3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(879, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnApprove1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(btnApprove3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnApprove2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnApprove1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnApprove)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove2)
                    .addComponent(btnApprove3))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        RightPanel.add(jPanel3, "card2");

        jSplitPane1.setRightComponent(RightPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        HealthcampDoctor tm;
        tm = new HealthcampDoctor(this.username);
        tm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        DefaultListModel<String> defaultListModel = (DefaultListModel<String>)jList1.getModel();
        String medicine = (String) jComboBox1.getSelectedItem();
        String quantity = String.valueOf((Integer) jSpinner1.getValue());
        defaultListModel.addElement(medicine + " --- " + quantity);
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnApprove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprove1ActionPerformed
        // TODO add your handling code here:
//        DefaultTableModel model = (DefaultTableModel) tblTransport.getModel();
//        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        String Date = dateFormat.format(java.util.Calendar.getInstance().getTime());
        int selectedRow = tblTransport.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null,"Select a row before choosing to view/delete record", " Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name = (String) tblTransport.getValueAt(selectedRow, 1);
        
        String medicines = "";
        model2 = (DefaultListModel<String>)jList1.getModel();
        for(String s: Collections.list(model2.elements())){
            medicines = medicines + s + "<>"; 
        }
        medicines = medicines.substring(0, medicines.length()-2);
        if(medicines.startsWith("<>")){
            medicines = medicines.substring(2);
        }
        patientReportController.updateMedicines(medicines, name);
        JOptionPane.showMessageDialog(null,"Medication added to report", "Success!", JOptionPane.INFORMATION_MESSAGE);
        model2.clear();
        jSpinner1.setValue(0);
    }//GEN-LAST:event_btnApprove1ActionPerformed

    private void btnApprove2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprove2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblTransport.getModel();
        int selectedRow = tblTransport.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null,"Select a row before choosing to view/delete record", " Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name = (String) tblTransport.getValueAt(selectedRow, 1);
        ArrayList<String> prr = patientReportController.getMedicinesFromPatientReports(name);
        PatientReport newjFrame = new PatientReport(name);
        for(String pr: prr){
            newjFrame.setMedicines(pr);
        }
        newjFrame.setVisible(true);
    }//GEN-LAST:event_btnApprove2ActionPerformed

    private void tblTransportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTransportMouseClicked
        // TODO add your handling code here:
        model2 = (DefaultListModel<String>)jList1.getModel();
        int selectedRow = tblTransport.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null,"Select a row before choosing to view/delete record", " Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name = (String) tblTransport.getValueAt(selectedRow, 1);
        ArrayList<String> meds = patientReportController.getMedicinesFromPatientReports(name);
        for(String med: meds){
            DefaultListModel<String> defaultListModel = (DefaultListModel<String>)jList1.getModel();
            defaultListModel.clear();
            if(med != null){
                for(String s: Arrays.asList(med.split("<>"))){
                defaultListModel.addElement(s);
             }
            }
            
        }
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fp?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Deepak@1999");
//            Statement myStatement = con.createStatement();
//
//            String query = "select medicines from patient_report where name='" + name + "'";
//            ResultSet rs = myStatement.executeQuery(query);
//            String medicines = "";
//            while (rs.next()) {
//                medicines = rs.getString("medicines");
//            }
//            DefaultListModel<String> defaultListModel = (DefaultListModel<String>)jList1.getModel();
//            defaultListModel.clear();
//            for(String s: Arrays.asList(medicines.split("<>"))){
//               defaultListModel.addElement(s);
//            }
//        } catch (Exception E) {
//            JOptionPane.showMessageDialog(this, E + "Error in DB connection");
//            log.error("Error in DB connection");
//        }
    }//GEN-LAST:event_tblTransportMouseClicked

    private void btnApprove3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprove3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblTransport.getModel();
        int selectedRow = tblTransport.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null,"Select a row before choosing to view/delete record", " Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String patientName = (String) tblTransport.getValueAt(selectedRow, 1);
        String medicines = "";
        String doctorName = (String) tblTransport.getValueAt(selectedRow, 5);
        String healthcampName = (String) tblTransport.getValueAt(selectedRow, 4);
        ArrayList<String> prr = patientReportController.getMedicinesFromPatientReports(patientName);
        for(String pr: prr){
            medicines = pr;
        }
        pharmacyRequestsController.insertPharmacyRequests(patientName, medicines, doctorName, healthcampName, "Request Created");
        JOptionPane.showMessageDialog(null,"Request created at Pharmacy", "Success!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnApprove3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HealthcampDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HealthcampDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HealthcampDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HealthcampDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HealthcampDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RightPanel;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnApprove1;
    private javax.swing.JButton btnApprove2;
    private javax.swing.JButton btnApprove3;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable tblTransport;
    // End of variables declaration//GEN-END:variables
}
