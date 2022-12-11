package UI.Finance.FundRaiser;

import Models.Sponsor;
import Controller.SponsorController;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author manideepakreddyaila
 */
public class MainFundRaise extends javax.swing.JPanel {

    /**
     * Creates new form VaccineManufRequests
     */
    private SponsorController sponsorController;
    private String healthcampName;
    private int totalAmount;
    JPanel RightPanel;
    String selectedOrg;
    static Logger log = Logger.getLogger(MainFundRaise.class.getName());

    public void addMedicinesToCart( String healthcampName, int totalAmount){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        this.healthcampName = healthcampName;
        this.totalAmount = totalAmount;
        heading.setText(heading.getText() + healthcampName);
//        jProgressBar1.setOrientation(JProgressBar.VERTICAL);
        int totalDonated = 0;
        ArrayList<Integer> totalDonated1 = sponsorController.getFundRaiserRequests(healthcampName);
        for(Integer td: totalDonated1){
            totalDonated = td;
        }
        jProgressBar1.setValue((totalDonated*100)/totalAmount);
        jProgressBar1.setMaximum(100);
        jProgressBar1.setStringPainted(true);
        jProgressBar1.setBackground(Color.ORANGE);
        jProgressBar1.setForeground(Color.BLACK);
        jProgressBar1.setString("Amount " + totalDonated + " raised out of " + totalAmount);
        
        ArrayList<Sponsor> sponsors = sponsorController.getAll(healthcampName);
        for(Sponsor sp: sponsors){
            Object row[] = new Object[3];
            row[0] = sp.getSponsorName();
            row[1] = sp.getAmount();
            row[2] = sp.getDate();
            model.addRow(row);
        }
    }
    
    public MainFundRaise(JPanel RightPanel) {
        initComponents();
        this.RightPanel = RightPanel;
        sponsorController = new SponsorController();
//        jList1.setModel(new DefaultListModel<>());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading = new javax.swing.JLabel();
        lblRequest1 = new javax.swing.JLabel();
        lblRequest2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        heading.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        heading.setForeground(new java.awt.Color(102, 153, 255));
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("FUNDRAISER FOR HEALTHCAMP: ");

        lblRequest1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lblRequest2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sponsor Name", "Amount Donated", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRequest2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRequest1)
                        .addGap(361, 361, 361)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblRequest1, lblRequest2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(lblRequest1)
                .addGap(270, 270, 270)
                .addComponent(lblRequest2)
                .addGap(435, 435, 435))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblRequest1;
    private javax.swing.JLabel lblRequest2;
    // End of variables declaration//GEN-END:variables
}
