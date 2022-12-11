/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.FundRaiserRequest;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author manideepakreddyaila
 */
public class FundRaiserController {

    public FundRaiserController() {
    }
    
    public ArrayList<FundRaiserRequest> getFundRaiserRequests(){
        ArrayList<FundRaiserRequest> fundRaiserRequests = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select * from fundraiser_requests";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                fundRaiserRequests.add(new FundRaiserRequest(rs.getString("healthcamp_name"), rs.getInt("total_amount"), rs.getString("status"), rs.getString("created_date"), rs.getInt("amount_due")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fundRaiserRequests;   
    }
    
    public void updateStatus(String newStatus, String healthcampName){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Update fundraiser_requests set status='" + newStatus + "' where healthcamp_name='" + healthcampName + "'";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
    public boolean checkHealthcampExists(String healthcamp){
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select healthcamp_name from fundraiser_requests where healthcamp_name = '" + healthcamp + "'";
            ResultSet rs = statement.executeQuery(query);
            if(!rs.next()){
                rs.close();
                return true;
            }
            
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void insertFundRaiserRequest(String healthcampName, int totalBill, String status, String date,int amountDue){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Insert into `fundraiser_requests` " + "values('" + healthcampName + "'," + totalBill + ",'" + status + "','" + date + "'," + amountDue + ")";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
}
