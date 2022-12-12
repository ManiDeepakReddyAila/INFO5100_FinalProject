package UI.Finance.Sponsor;

import Models.FundRaiserRequest;
import Controller.FundRaiserController;
import Controller.SponsorController;
import UI.Login;
import UI.Login;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author manideepakreddyaila
 */
public class Sponsor extends javax.swing.JFrame {

    private FundRaiserController fundRaiserController;
    private SponsorController sponsorController;
    private String loggedInUser;
    DefaultTableModel model;
    static Logger log = Logger.getLogger(Sponsor.class.getName());
    
    public Sponsor() {
        initComponents();
    }
    
    public Sponsor(String loggedInUser) {
        this.loggedInUser = loggedInUser;
        initComponents();
        fundRaiserController = new FundRaiserController();
        sponsorController = new SponsorController();
        model = (DefaultTableModel) tblBloodBank.getModel();
        model.setRowCount(0);
        ArrayList<FundRaiserRequest> frr = fundRaiserController.getFundRaiserRequests();
        for(FundRaiserRequest fr: frr){
            Object row[] = new Object[4];
            row[0] = fr.getHealthcampName();
            row[1] = fr.getTotalAmount();
            row[2] = fr.getCreatedDate();
            row[3] = fr.getAmountDue();
            if(fr.getAmountDue() > 0)
                model.addRow(row);
        }
    }
    
     public void refreshTable(){
         model.setRowCount(0);
         ArrayList<FundRaiserRequest> frr = fundRaiserController.getFundRaiserRequests();
        for(FundRaiserRequest fr: frr){
            Object row[] = new Object[4];
            row[0] = fr.getHealthcampName();
            row[1] = fr.getTotalAmount();
            row[2] = fr.getCreatedDate();
            row[3] = fr.getAmountDue();
            if(fr.getAmountDue() > 0)
                model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnViewRequest = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        RightPane = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBloodBank = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRequestID = new javax.swing.JTextField();
        btnApprove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 119, 182));

        btnViewRequest.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnViewRequest.setText("VIEW REQUEST");
        btnViewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnLogout.setText("LOG OUT");
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
                .addGap(29, 29, 29)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnViewRequest, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnViewRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 651, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(42, 42, 42))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        RightPane.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblBloodBank.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "HEALTH CAMP NAME", "TOTAL AMOUNT", "CREATED ON", "AMOUNT DUE"
            }
        ));
        jScrollPane1.setViewportView(tblBloodBank);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SPONSOR");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("AMOUNT :");

        txtRequestID.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        btnApprove.setBackground(new java.awt.Color(0, 119, 182));
        btnApprove.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("DONATE");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(617, 617, 617))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 148, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel2)
                .addGap(75, 75, 75)
                .addComponent(txtRequestID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRequestID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnApprove)
                .addContainerGap(383, Short.MAX_VALUE))
        );

        RightPane.add(jPanel3, "card2");

        jSplitPane1.setRightComponent(RightPane);

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
        Sponsor bbm;
        bbm = new Sponsor(loggedInUser);
        bbm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewRequestActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String date = dateFormat.format(java.util.Calendar.getInstance().getTime());
        int selectedRow = tblBloodBank.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null,"Select a row before choosing to view/delete record", " Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String healthcampName = (String) tblBloodBank.getValueAt(selectedRow, 0);
        int amountDue = (Integer) tblBloodBank.getValueAt(selectedRow, 3);
        int amountDonated = Integer.parseInt(txtRequestID.getText());
        if(amountDue >= amountDonated && amountDonated >= 0 ){
            sponsorController.insertSponsor(loggedInUser, healthcampName, amountDonated, date);
            sponsorController.updateAmountDue(amountDue, amountDonated, healthcampName);
            JOptionPane.showMessageDialog(this, "Thank you for your valuable contribution!");
        } else {
            JOptionPane.showMessageDialog(this, "Donate valid amount");
            return;
        }
        refreshTable();
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(Sponsor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sponsor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sponsor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sponsor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sponsor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RightPane;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnViewRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable tblBloodBank;
    private javax.swing.JTextField txtRequestID;
    // End of variables declaration//GEN-END:variables
}
