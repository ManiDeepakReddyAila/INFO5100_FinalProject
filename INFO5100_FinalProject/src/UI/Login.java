/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import UI.Service.Pharmacy.Pharmacy;
import UI.Service.Healthcamp.HealthcampDoctor;
import UI.Service.Healthcamp.Healthcamp;
import UI.Medical.Hospital.Hospital;
import UI.Medical.Lab.Lab;
import UI.Finance.FundRaiser.Fundraiser;
import UI.Finance.Sponsor.Sponsor;
import UI.Finance.Account.Account;
import Models.User;
import Controller.LoginController;
import Screens.HierarchyManage;
import java.awt.CardLayout;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author saideepak
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private LoginController loginController;
    public HierarchyManage hr;
    public Fundraiser fr;
    public Lab fm;
    public Hospital crm;
    public Healthcamp tm;
    public HealthcampDoctor tm1;
    public createRequests cr;
    public Pharmacy vm;
    public Account mef;
    public Sponsor bbm;
    static Logger log = Logger.getLogger(Login.class.getName());

    public Login() {
        initComponents();
        loginController = new LoginController();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        PanelLogin = new javax.swing.JPanel();
        RightPanel = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPwd = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setLeftComponent(leftPanel);

        PanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        PanelLogin.setLayout(new java.awt.CardLayout());

        RightPanel.setBackground(new java.awt.Color(255, 255, 255));
        RightPanel.setPreferredSize(new java.awt.Dimension(1300, 800));

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login button_final.jpg"))); // NOI18N
        btnLogin.setBorder(null);
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.setIconTextGap(8);
        btnLogin.setMaximumSize(new java.awt.Dimension(675, 353));
        btnLogin.setMinimumSize(new java.awt.Dimension(675, 353));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/register.jpg"))); // NOI18N
        btnRegister.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRegister.setPreferredSize(new java.awt.Dimension(75, 35));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        txtUserName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inventory-management.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        txtPwd.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user1.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("UserName:");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("Password:");

        javax.swing.GroupLayout RightPanelLayout = new javax.swing.GroupLayout(RightPanel);
        RightPanel.setLayout(RightPanelLayout);
        RightPanelLayout.setHorizontalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPwd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(276, 276, 276))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightPanelLayout.createSequentialGroup()
                        .addGap(0, 287, Short.MAX_VALUE)
                        .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RightPanelLayout.createSequentialGroup()
                                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(382, 382, 382))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightPanelLayout.createSequentialGroup()
                                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(455, 455, 455)))))))
        );

        RightPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPwd, txtUserName});

        RightPanelLayout.setVerticalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(52, 52, 52)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelLogin.add(RightPanel, "card2");

        jSplitPane1.setRightComponent(PanelLogin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        RegistrationScreen rs = new RegistrationScreen(PanelLogin);
        PanelLogin.add("RegistrationScreen", rs);
        CardLayout layout = (CardLayout) PanelLogin.getLayout();
        layout.next(PanelLogin);


    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String UserName = txtUserName.getText();
        char[] passwordArr = txtPwd.getPassword();
        String password = String.valueOf(passwordArr);
        
        List<User> users = loginController.getUsers();
        for(User u: users){
            if(UserName.equalsIgnoreCase(u.getUsername()) && password.equalsIgnoreCase(u.getPassword())){
                String org = u.getOrganization();
                if (org.equalsIgnoreCase("Admin")) {
                        hr = new HierarchyManage();
                        hr.setVisible(true);
                        this.dispose();
                        return;
                    } else if (org.equalsIgnoreCase("FundRaiser")) {
                        fr = new Fundraiser();
                        fr.setVisible(true);
                        this.dispose();
                        return;
                    } else if (org.equalsIgnoreCase("Lab")) {
                        fm = new Lab(u.getUsername());
                        fm.setVisible(true);
                        this.dispose();
                        return;
                    } else if (org.equalsIgnoreCase("Hospital")) {
                        crm = new Hospital(u.getUsername());
                        crm.setVisible(true);
                        this.dispose();
                        return;
                    } else if (org.equalsIgnoreCase("Healthcamp") && !u.getUsername().contains("doc")) {
                        tm = new Healthcamp();
                        tm.setVisible(true);
                        this.dispose();
                        return;
                    } else if (org.equalsIgnoreCase("Healthcamp") && u.getUsername().contains("doc")) {
                        tm1 = new HealthcampDoctor(u.getUsername());
                        tm1.setVisible(true);
                        this.dispose();
                        return;
                    }else if (org.equalsIgnoreCase("Ngo")) {
                        cr = new createRequests();
                        cr.setVisible(true);
                        this.dispose();
                        return;
                    }  else if (org.equalsIgnoreCase("Pharmacy")) {
                        vm = new Pharmacy();
                        vm.setVisible(true);
                        this.dispose();
                        return;
                    } else if (org.equalsIgnoreCase("Account")) {
                        mef = new Account();
                        mef.setVisible(true);
                        this.dispose();
                        return;
                    } else if (org.equalsIgnoreCase("Sponsor")) {
                        bbm = new Sponsor(u.getUsername());
                        bbm.setVisible(true);
                        this.dispose();
                        return;
                    }
            }
        }

//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fp?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Deepak@1999");
//            Statement myStatement = con.createStatement();
//            String query = "Select * from users";
//            ResultSet rs = myStatement.executeQuery(query);
//            
//            while (rs.next()) {
//                String DBUsername = rs.getString("username");
//                String DBPassword = rs.getString("password");
//                String DBOrg = rs.getString("organization");
//
//                if (UserName.equalsIgnoreCase(DBUsername) && password.equalsIgnoreCase(DBPassword)) {
//                    
//                    if (DBOrg.equalsIgnoreCase("Admin")) {
//                        hr = new HierarchyManage();
//                        hr.setVisible(true);
//                        this.dispose();
//                        return;
//                    } else if (DBOrg.equalsIgnoreCase("FundRaiser")) {
//                        fr = new Fundraiser();
//                        fr.setVisible(true);
//                        this.dispose();
//                        return;
//                    } else if (DBOrg.equalsIgnoreCase("Lab")) {
//                        fm = new Lab();
//                        fm.setVisible(true);
//                        this.dispose();
//                        return;
//                    } else if (DBOrg.equalsIgnoreCase("Hospital")) {
//                        crm = new Hospital();
//                        crm.setVisible(true);
//                        this.dispose();
//                        return;
//                    } else if (DBOrg.equalsIgnoreCase("Healthcamp") && !DBUsername.contains("doc")) {
//                        tm = new Healthcamp();
//                        tm.setVisible(true);
//                        this.dispose();
//                        return;
//                    } else if (DBOrg.equalsIgnoreCase("Healthcamp") && DBUsername.contains("doc")) {
//                        tm1 = new HealthcampDoctor(DBUsername);
//                        tm1.setVisible(true);
//                        this.dispose();
//                        return;
//                    }else if (DBOrg.equalsIgnoreCase("Ngo")) {
//                        cr = new createRequests();
//                        cr.setVisible(true);
//                        this.dispose();
//                        return;
//                    }  else if (DBOrg.equalsIgnoreCase("Pharmacy")) {
//                        vm = new Pharmacy();
//                        vm.setVisible(true);
//                        this.dispose();
//                        return;
//                    } else if (DBOrg.equalsIgnoreCase("Account")) {
//                        mef = new Account();
//                        mef.setVisible(true);
//                        this.dispose();
//                        return;
//                    } else if (DBOrg.equalsIgnoreCase("Sponsor")) {
//                        bbm = new Sponsor(DBUsername);
//                        bbm.setVisible(true);
//                        this.dispose();
//                        return;
//                    }
//                }
//
//            }
//            //System.out.println("Inserted data");
//        } catch (Exception E) {
//            JOptionPane.showMessageDialog(this, E + "Error while fetching data from DB");
//            log.error("Error while fetching data from DB");
//        }


    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JPanel RightPanel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
