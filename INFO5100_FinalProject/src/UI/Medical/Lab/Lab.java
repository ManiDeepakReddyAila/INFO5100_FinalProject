/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Medical.Lab;

import Models.LabRequest;
import Controller.HospitalController;
import Controller.LabController;
import Controller.OrganizationController;
import UI.Login;
import UI.Login;
import UI.PatientReport;
import UI.PatientReport;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author aesha
 */
public class Lab extends javax.swing.JFrame {

    /**
     * Creates new form FoodMarketMain
     */
    private String name;
    private LabController labController;
    private HospitalController hospitalController;
    private OrganizationController orgController;
    private DefaultTableModel model;
    static Logger log = Logger.getLogger(Lab.class.getName());
    
    public Lab(){
        
    }

    public Lab(String name) {
        initComponents();
        this.name = name;
        this.labController = new LabController();
        this.orgController = new OrganizationController();
        hospitalController = new HospitalController();
        this.model = (DefaultTableModel) tblLab.getModel();
        model.setRowCount(0);
        
        populateTable(name);
        jComboBox1.removeAllItems();
        ArrayList<String> hospitals = orgController.getHospitalNames();
        for(String s: hospitals){
            jComboBox1.addItem(s);
        }
    }

    public void populateTable(String name){
        ArrayList<LabRequest> lrr = labController.getLabRequests(name);
        for(LabRequest lr: lrr){
            Object row[] = new Object[5];
                row[0] = lr.getLabName();
                row[1] = lr.getPatientName();
                row[2] = lr.getTestName();
                row[3] = lr.getStatus();
                row[4] = lr.getDescription();
                model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnViewRequest = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        RightPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLab = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnApprove1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        btnViewRequest.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnViewRequest.setForeground(new java.awt.Color(51, 153, 255));
        btnViewRequest.setText("View Requests");
        btnViewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestActionPerformed(evt);
            }
        });

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoutimage.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 153, Short.MAX_VALUE))
                    .addComponent(btnViewRequest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnViewRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 651, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel1);

        RightPanel.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(237, 243, 254));

        tblLab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Lab Name", "Patient", "Test Name", "Status", "Description"
            }
        ));
        jScrollPane1.setViewportView(tblLab);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LAB REQUESTS");

        btnApprove.setBackground(new java.awt.Color(102, 153, 255));
        btnApprove.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("APPROVE");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(102, 153, 255));
        btnReject.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("REJECT");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 153, 255));
        jButton3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ANALYTICS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnApprove1.setBackground(new java.awt.Color(102, 153, 255));
        btnApprove1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnApprove1.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove1.setText("GENERATE REPORT");
        btnApprove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprove1ActionPerformed(evt);
            }
        });

        jButton2.setText("Send Request");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(344, 344, 344))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnApprove1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jButton2)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnApprove, btnReject, jButton3});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove)
                    .addComponent(btnReject)
                    .addComponent(jButton3))
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnApprove1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jButton2))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82))))
        );

        RightPanel.add(jPanel3, "card2");

        jSplitPane1.setRightComponent(RightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestActionPerformed
        // TODO add your handling code here:
        RightPanel.remove(this);
        CardLayout layout = (CardLayout) RightPanel.getLayout();
        layout.previous(RightPanel);
    }//GEN-LAST:event_btnViewRequestActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String Date = dateFormat.format(java.util.Calendar.getInstance().getTime());
        int selectedRow = tblLab.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null,"Select a row before choosing to view/delete record", " Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name = (String) tblLab.getValueAt(selectedRow, 1);
        labController.updateStatus("APPROVED", name);
        JOptionPane.showMessageDialog(this, "Request Approved!!");
        model.setRowCount(0);
        populateTable(name);
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String Date = dateFormat.format(java.util.Calendar.getInstance().getTime());
        int selectedRow = tblLab.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null,"Select a row before choosing to view/delete record", " Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name = (String) tblLab.getValueAt(selectedRow, 1);
        labController.updateStatus("REJECTED", name);
        JOptionPane.showMessageDialog(this, "Request Rejected!!");
        model.setRowCount(0);
        populateTable(name);
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AdvancedFeatures.Analytics chart = new AdvancedFeatures.Analytics("Lab Requests");
        int accepted = 0;
        int rejected = 0;
        int pending = 0;

        for (int row = 0; row < model.getRowCount(); row++) {
            String s = (String) model.getValueAt(row, 3);
            if (s.equals("APPROVED")) {
                accepted++;
                System.out.println("approved");
            } else if (s.equals("REJECTED")) {
                rejected++;
                System.out.println("rejected");
            } else {
                pending++;
                System.out.println("other");
            }
        }
        chart.drawChart(accepted, rejected, pending, model.getRowCount());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnApprove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprove1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblLab.getModel();
        int selectedRow = tblLab.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null,"Select a row before choosing to view/delete record", " Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name = (String) tblLab.getValueAt(selectedRow, 1);
        String status = (String) tblLab.getValueAt(selectedRow, 3);
        if(status.equals("APPROVED")){
           PatientReport n = new PatientReport(name);
           n.setVisible(true);
        }
    }//GEN-LAST:event_btnApprove1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String date = dateFormat.format(java.util.Calendar.getInstance().getTime());
        
        int selectedRow = tblLab.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null,"Select a row before choosing to view/delete record", " Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String patientName = (String) tblLab.getValueAt(selectedRow, 1);
        String hospitalName = (String) jComboBox1.getSelectedItem();
        String status = "Pending";
        String description = jTextField1.getText();
        String labName = (String) tblLab.getValueAt(selectedRow, 0);
        String testName = (String) tblLab.getValueAt(selectedRow, 2);
        hospitalController.insertHospitalRequest(hospitalName, patientName, date, labName, testName, status, description);
        JOptionPane.showMessageDialog(this, "Hospital Request Created Successfully!!..");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RightPanel;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnApprove1;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnViewRequest;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblLab;
    // End of variables declaration//GEN-END:variables
}
