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
 * @author manideepakreddyaila
 */
public class HomeScreen extends javax.swing.JFrame {

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
    static Logger log = Logger.getLogger(HomeScreen.class.getName());

    public HomeScreen() {
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
        jLabel6 = new javax.swing.JLabel();
        lblLoggedInAs = new javax.swing.JLabel();
        lblLoggedInAs1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setLeftComponent(leftPanel);

        PanelLogin.setLayout(new java.awt.CardLayout());

        RightPanel.setBackground(new java.awt.Color(255, 255, 255));
        RightPanel.setPreferredSize(new java.awt.Dimension(1300, 800));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ICS-Career-GPS-5.jpeg"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(1600, 900));
        jLabel6.setMinimumSize(new java.awt.Dimension(1600, 900));
        jLabel6.setPreferredSize(new java.awt.Dimension(1600, 900));

        lblLoggedInAs.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        lblLoggedInAs.setForeground(new java.awt.Color(0, 102, 0));
        lblLoggedInAs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoggedInAs.setText(">>");
        lblLoggedInAs.setToolTipText("");
        lblLoggedInAs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoggedInAsMouseClicked(evt);
            }
        });

        lblLoggedInAs1.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        lblLoggedInAs1.setForeground(new java.awt.Color(0, 102, 0));
        lblLoggedInAs1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoggedInAs1.setText("WELCOME TO HEALTHCAMP MANAGEMENT SYSTEM");
        lblLoggedInAs1.setToolTipText("");

        javax.swing.GroupLayout RightPanelLayout = new javax.swing.GroupLayout(RightPanel);
        RightPanel.setLayout(RightPanelLayout);
        RightPanelLayout.setHorizontalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPanelLayout.createSequentialGroup()
                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RightPanelLayout.createSequentialGroup()
                        .addGap(1148, 1148, 1148)
                        .addComponent(lblLoggedInAs, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 829, Short.MAX_VALUE))
            .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RightPanelLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(lblLoggedInAs1, javax.swing.GroupLayout.PREFERRED_SIZE, 1106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1279, Short.MAX_VALUE)))
        );
        RightPanelLayout.setVerticalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPanelLayout.createSequentialGroup()
                .addComponent(lblLoggedInAs, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1271, Short.MAX_VALUE))
            .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RightPanelLayout.createSequentialGroup()
                    .addComponent(lblLoggedInAs1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1980, Short.MAX_VALUE)))
        );

        PanelLogin.add(RightPanel, "card2");

        jSplitPane1.setRightComponent(PanelLogin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 2400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 2060, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLoggedInAsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoggedInAsMouseClicked
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLoggedInAsMouseClicked

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
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JPanel RightPanel;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblLoggedInAs;
    private javax.swing.JLabel lblLoggedInAs1;
    private javax.swing.JPanel leftPanel;
    // End of variables declaration//GEN-END:variables
}
