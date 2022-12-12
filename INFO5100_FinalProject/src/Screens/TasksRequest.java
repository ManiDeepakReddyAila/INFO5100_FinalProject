/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Screens;

import Controller.AdminController;
import Controller.OrganizationController;
import Models.AdminRequests;
import javax.swing.JPanel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saideepak
 */
public class TasksRequest extends javax.swing.JPanel {
    private AdminController adminController;
    private JPanel RightPanel;
    private DefaultTableModel md;
    private OrganizationController organizationController;

    public TasksRequest(JPanel RightPanel) {
        initComponents();
        adminController = new AdminController();
        organizationController = new OrganizationController();
        this.RightPanel = RightPanel;
        populateTable();
    }
    
    public void populateTable(){
        ArrayList<AdminRequests> adminReqs = adminController.getAdminRequests();
        md = (DefaultTableModel) tblManageRequest.getModel();
        md.setRowCount(0);
        for(AdminRequests a: adminReqs){
            Object row[] = new Object[5];
            row[0] = a.getHealthcampName();
            row[1] = a.getNumberOfBeds();
            row[2] = a.getRequestedBy();
            row[3] = a.getDate();
            row[4] = a.getStatus();
            md.addRow(row);
        }
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageRequest = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 249, 173));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setText("MANAGE REQUEST");

        tblManageRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Healthcamp", "No. Of Beds", "Requested By", "Date", "Status"
            }
        ));
        tblManageRequest.setGridColor(new java.awt.Color(0, 0, 0));
        tblManageRequest.setShowGrid(false);
        jScrollPane1.setViewportView(tblManageRequest);

        btnApprove.setBackground(new java.awt.Color(248, 237, 98));
        btnApprove.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnApprove.setText("APPROVE");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(248, 237, 98));
        btnReject.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnReject.setText("REJECT");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(169, 169, 169)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove)
                    .addComponent(btnReject))
                .addContainerGap(311, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        int selectedRow = tblManageRequest.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null,"Please select a row!", " Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String healthcampName = (String) tblManageRequest.getValueAt(selectedRow, 0);
        adminController.updateStatus("APPROVED", healthcampName);
        
        populateTable();
        organizationController.insertOrg(healthcampName, "Healthcamp", "Service", "US");
        JOptionPane.showMessageDialog(null,"Request Approved, Healthcamp added!", " Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        int selectedRow = tblManageRequest.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null,"Please select a row!", " Info", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String healthcampName = (String) tblManageRequest.getValueAt(selectedRow, 0);
        adminController.updateStatus("REJECTED", healthcampName);
        JOptionPane.showMessageDialog(null,"Request Rejected!", " Sorry", JOptionPane.INFORMATION_MESSAGE);
        populateTable();
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManageRequest;
    // End of variables declaration//GEN-END:variables
}
