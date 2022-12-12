/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.FundRaiserRequest;
import Models.Sponsor;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author saideepak
 */
public class SponsorController {
    public void insertSponsor(String loggedInUser, String healthcampName, int amountDonated, String date){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Insert into `sponsor`" + "values('" + loggedInUser + "','" + healthcampName + "','" + amountDonated + "','" + date + "')";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
    public void updateAmountDue(int amountDue, int amountDonated, String healthcampName){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query;
            if(amountDue - amountDonated == 0){
                query = "Update `fundraiser_requests` set amount_due = " +  (amountDue - amountDonated) + ", status = 'Completed' where healthcamp_name = '" + healthcampName+ "'";
            } else {
                query = "Update `fundraiser_requests` set amount_due = " +  (amountDue - amountDonated) + " where healthcamp_name = '" + healthcampName+ "'";
            }
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
    public ArrayList<Integer> getFundRaiserRequests(String healthcampName){
        ArrayList<Integer> totalDonated = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select sum(amount) as total_donated from sponsor group by healthcamp_name having healthcamp_name = '" + healthcampName + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                totalDonated.add(rs.getInt("total_donated"));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalDonated;   
    }
    
    public ArrayList<Sponsor> getAll(String healthcampName){
        ArrayList<Sponsor> totalDonated = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select * from sponsor where healthcamp_name = '" + healthcampName + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                totalDonated.add(new Sponsor(rs.getString("sponsor_name"), rs.getString("healthcamp_name"), rs.getInt("amount"), rs.getString("Date")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalDonated;   
    }
}
