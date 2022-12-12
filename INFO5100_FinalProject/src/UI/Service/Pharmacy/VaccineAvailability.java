/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Service.Pharmacy;

import Models.Medicines;
import Controller.MedicinesController;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author manideepakreddyaila
 * 
 */
public class VaccineAvailability extends javax.swing.JPanel {

    private MedicinesController medicineController;
    private DefaultTableModel model;
    static Logger log = Logger.getLogger(VaccineAvailability.class.getName());
    
    public void addMedicinesToCart(String patientName, String medicines){
        
    }

    public VaccineAvailability(JPanel RightPane) {
        
        initComponents();
        medicineController = new MedicinesController();
        populateTable();
    }
    
    public void populateTable(){
        model = (DefaultTableModel) tblVaccineAvailability.getModel();
        model.setRowCount(0);
        ArrayList<Medicines> meds = medicineController.getMedicines();
        for(Medicines med: meds){
            Object row[] = new Object[3];
            row[0] = med.getMedicineName();
            row[1] = med.getQuantity();
            row[2] = med.getPrice();
            model.addRow(row);
            jComboBox1.addItem(med.getMedicineName());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVaccineAvailability = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAvailableQuantity = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(222, 242, 218));

        jPanel1.setBackground(new java.awt.Color(222, 242, 218));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));

        jLabel2.setBackground(new java.awt.Color(51, 153, 255));
        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VACCINES AVAILABILITY");

        tblVaccineAvailability.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Available Vaccines", "Available Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblVaccineAvailability);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel4.setText("Available Vaccines:");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel5.setText("Available Quantity:");

        btnCreate.setBackground(new java.awt.Color(0, 102, 0));
        btnCreate.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("REQUEST VACCINE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(531, 531, 531)
                .addComponent(btnCreate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAvailableQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtAvailableQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnCreate)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        String vaccine = (String) jComboBox1.getSelectedItem();
        int quantityReq = Integer.parseInt(txtAvailableQuantity.getText());
        JOptionPane.showMessageDialog(null,"Requested for " + quantityReq + " units for vaccine: " + vaccine, "Info!", JOptionPane.INFORMATION_MESSAGE);
        ArrayList<Medicines> meds = medicineController.getMedicines1(vaccine);
        int quantity = 0;
        for(Medicines med: meds){
            quantity = med.getQuantity();
        }
        medicineController.updateMedicines1(quantityReq, quantity,  vaccine);
        populateTable();
        
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVaccineAvailability;
    private javax.swing.JTextField txtAvailableQuantity;
    // End of variables declaration//GEN-END:variables
}
