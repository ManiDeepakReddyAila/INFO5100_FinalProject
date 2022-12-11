/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Classes.Accounts;
import Classes.HealthcampBill;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author manideepakreddyaila
 */
public class BillController {
    
    public ArrayList<String> getHealthcampNames(){
        ArrayList<String> healthcamps = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "Select distinct healthcamp_name from bill";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                healthcamps.add(rs.getString("healthcamp_name"));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return healthcamps; 
    }
    
    public ArrayList<HealthcampBill> getBill(String healthcampName){
        ArrayList<HealthcampBill> healthcampBills = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "Select distinct healthcamp_name, sum(total_bill) as total from bill group by healthcamp_name having healthcamp_name = '" + healthcampName + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                healthcampBills.add(new HealthcampBill(rs.getString("healthcamp_name"), rs.getInt("total")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return healthcampBills; 
    }
    
    public void insertBill(String name, int sum, String healthcampName){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Insert into `bill`" + "values('" + name + "','" + healthcampName + "','" + sum + "')";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
    public boolean getPatientName(String name){
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select patient_name from bill where patient_name = '" + name + "'";
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
    
}
