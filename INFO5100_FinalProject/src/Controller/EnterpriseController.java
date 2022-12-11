/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Enterprise;
import Models.LabRequest;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author manideepakreddyaila
 */
public class EnterpriseController {
    
    public ArrayList<Enterprise> getEnterprise(String name){
        ArrayList<Enterprise> enterprises = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select * from enterprise where network_name ='" + name + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                enterprises.add(new Enterprise(rs.getString("enterprise_name"), rs.getString("network_name")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return enterprises;   
    }
    
    public void updateStatus(String newStatus, String patientName){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Update lab_requests set status='" + newStatus +  "' where patient_name='" + patientName + "'";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
    public void insertLabRequest(String name, String network){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Insert into `enterprise` " + "values('" + name + "','" + network + "')";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
}
