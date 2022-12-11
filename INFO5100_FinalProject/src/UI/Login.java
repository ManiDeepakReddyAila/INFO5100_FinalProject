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
        txtUserName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPwd = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setLeftComponent(leftPanel);

        PanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        PanelLogin.setLayout(new java.awt.CardLayout());

        RightPanel.setBackground(new java.awt.Color(222, 242, 218));
        RightPanel.setPreferredSize(new java.awt.Dimension(1300, 800));

        txtUserName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/welcomeimage.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(548, Short.MAX_VALUE))
        );

        txtPwd.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" LOG IN");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/userlogo.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel4.setText("UserName:");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel5.setText("Password:");

        jButton1.setBackground(new java.awt.Color(0, 102, 0));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOG IN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 0));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REGISTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RightPanelLayout = new javax.swing.GroupLayout(RightPanel);
        RightPanel.setLayout(RightPanelLayout);
        RightPanelLayout.setHorizontalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightPanelLayout.createSequentialGroup()
                        .addGap(0, 180, Short.MAX_VALUE)
                        .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(355, 355, 355))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightPanelLayout.createSequentialGroup()
                                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RightPanelLayout.createSequentialGroup()
                                        .addGap(193, 193, 193)
                                        .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                                    .addGroup(RightPanelLayout.createSequentialGroup()
                                        .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtUserName)
                                            .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(203, 203, 203))))))
        );
        RightPanelLayout.setVerticalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(47, 47, 47)
                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(46, 46, 46)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelLogin.add(RightPanel, "card2");

        jSplitPane1.setRightComponent(PanelLogin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1432, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1154, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:String UserName = txtUserName.getText();
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
                        cr = new createRequests(u.getUsername());
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           RegistrationScreen rs = new RegistrationScreen(PanelLogin);
        PanelLogin.add("RegistrationScreen", rs);
        CardLayout layout = (CardLayout) PanelLogin.getLayout();
        layout.next(PanelLogin);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
