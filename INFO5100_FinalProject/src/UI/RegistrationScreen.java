/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Controller.UsersController;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author saideepak
 */
public class RegistrationScreen extends javax.swing.JPanel {

    private UsersController usersController;
    private JPanel rightPanel;
    static Logger log = Logger.getLogger(RegistrationScreen.class.getName());

    public RegistrationScreen(JPanel rightPanel) {
        initComponents();
        this.rightPanel = rightPanel;
        this.usersController = new UsersController();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegister = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        cmbEnterprise = new javax.swing.JComboBox<>();
        cmbOrganisation = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        pwd1 = new javax.swing.JPasswordField();
        pwd2 = new javax.swing.JPasswordField();
        txtcountry = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        panelRegister.setBackground(new java.awt.Color(222, 242, 218));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel1.setText("Username:");

        txtUsername.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel2.setText("Password: ");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel3.setText("Confirm Password:");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel4.setText("Name:");

        txtName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel5.setText("Email ID:");

        txtEmail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel6.setText("Country:");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel7.setText("Enterprise:");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel8.setText("Organisation:");

        btnRegister.setBackground(new java.awt.Color(0, 102, 0));
        btnRegister.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("REGISTER");
        btnRegister.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        cmbEnterprise.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cmbEnterprise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medical", "Voluntary", "Finance", "Service" }));
        cmbEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEnterpriseActionPerformed(evt);
            }
        });

        cmbOrganisation.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cmbOrganisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrganisationActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel9.setText("Contact:");

        txtcontact.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtcontact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcontactFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("REGISTER A NEW PATIENT HERE");

        btnBack.setBackground(new java.awt.Color(0, 102, 0));
        btnBack.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("GO BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        pwd1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pwd1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwd1FocusLost(evt);
            }
        });
        pwd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pwd1MouseExited(evt);
            }
        });

        pwd2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pwd2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwd2FocusLost(evt);
            }
        });
        pwd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pwd2MouseExited(evt);
            }
        });

        txtcountry.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/newuser3.png"))); // NOI18N

        javax.swing.GroupLayout panelRegisterLayout = new javax.swing.GroupLayout(panelRegister);
        panelRegister.setLayout(panelRegisterLayout);
        panelRegisterLayout.setHorizontalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcontact)
                    .addComponent(cmbOrganisation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbEnterprise, 0, 349, Short.MAX_VALUE)
                    .addComponent(txtcountry)
                    .addComponent(txtEmail)
                    .addComponent(pwd2)
                    .addComponent(pwd1)
                    .addComponent(txtUsername)
                    .addComponent(txtName))
                .addGap(50, 50, 50)
                .addComponent(jLabel13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisterLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(443, 443, 443))
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addGap(499, 499, 499)
                .addComponent(btnBack)
                .addGap(53, 53, 53)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRegisterLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel4});

        panelRegisterLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        panelRegisterLayout.setVerticalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel10)
                .addGap(55, 55, 55)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRegisterLayout.createSequentialGroup()
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(pwd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(pwd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtcountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbOrganisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13))
                .addGap(32, 32, 32)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        String Name = txtName.getText();
        String UserName = txtUsername.getText();

        char pass[] = pwd1.getPassword();
        String Password = String.valueOf(pass);

        char passconf[] = pwd2.getPassword();
        String PasswordConfirm = String.valueOf(passconf);
        String EmailId = txtEmail.getText();
        String Contact = txtcontact.getText();
        String Country = txtcountry.getText();
        String Organization = cmbOrganisation.getItemAt(cmbOrganisation.getSelectedIndex());
        String Enterprise = cmbEnterprise.getItemAt(cmbEnterprise.getSelectedIndex());

        if (Name.isEmpty() || UserName.isEmpty() || EmailId.isEmpty() || Contact.isEmpty()
                || Country.isEmpty() || Organization.isEmpty() || Enterprise.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please populate values!!..");
            return;
        }
        AdvancedFeatures.SendMail mail = new AdvancedFeatures.SendMail();
        mail.sendMail("Registration", "Registration Completed.!!", EmailId);
        log.info("Registration Completed.!!");

        //sendMail("Registration","Registered Successfully",EmailId);
        
        usersController.insertUser(Name, UserName, Password, Country, EmailId, Enterprise, Organization, Contact);
        JOptionPane.showMessageDialog(this, "User Created Successfully!!..");
        log.info("User Created Successfully!!..");
        txtEmail.setText(null);
        txtName.setText(null);
        txtUsername.setText(null);
        txtcontact.setText(null);
        txtcountry.setText(null);
        pwd1.setText(null);
        pwd2.setText(null);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void cmbOrganisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrganisationActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_cmbOrganisationActionPerformed

    private void cmbEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEnterpriseActionPerformed
        // TODO add your handling code here:
        String Enterprise = cmbEnterprise.getItemAt(cmbEnterprise.getSelectedIndex());
        cmbOrganisation.removeAllItems();
        if (Enterprise.equalsIgnoreCase("Medical")) {
            cmbOrganisation.addItem("Hospital");
            cmbOrganisation.addItem("Lab");
        } else if (Enterprise.equalsIgnoreCase("Voluntary")) {
            cmbOrganisation.addItem("Ngo");
        } else if (Enterprise.equalsIgnoreCase("Finance")) {
            cmbOrganisation.addItem("Account");
            cmbOrganisation.addItem("FundRaiser");
            cmbOrganisation.addItem("Sponsor");
        } else if (Enterprise.equalsIgnoreCase("Service")) {
            cmbOrganisation.addItem("Healthcamp");
            cmbOrganisation.addItem("Pharmacy");
        }
    }//GEN-LAST:event_cmbEnterpriseActionPerformed

    private void pwd1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwd1MouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_pwd1MouseExited

    private void pwd2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwd2MouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_pwd2MouseExited

    private void pwd1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwd1FocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_pwd1FocusLost

    private void pwd2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwd2FocusLost
        // TODO add your handling code here:
        char pass1[] = pwd1.getPassword();
        String Password1 = String.valueOf(pass1);
        if (Password1.length() <= 8) {
            JOptionPane.showMessageDialog(this, "Passwords should be more than 8 characters");
        }
        char pass2[] = pwd2.getPassword();
        String Password2 = String.valueOf(pass2);
        if (!Password2.equalsIgnoreCase(Password1)) {
            JOptionPane.showMessageDialog(this, "Passwords and confirm passwords are not matching!!");
            pwd2.setText(null);
        }
    }//GEN-LAST:event_pwd2FocusLost

    private void txtcontactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcontactFocusLost
        // TODO add your handling code here:
        String ContactNo = txtcontact.getText();
        if (ContactNo.length() != 10) {
            JOptionPane.showMessageDialog(this, "Please enter Valid Phone number!");
            return;
        }
    }//GEN-LAST:event_txtcontactFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbEnterprise;
    private javax.swing.JComboBox<String> cmbOrganisation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelRegister;
    private javax.swing.JPasswordField pwd1;
    private javax.swing.JPasswordField pwd2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtcountry;
    // End of variables declaration//GEN-END:variables
}
