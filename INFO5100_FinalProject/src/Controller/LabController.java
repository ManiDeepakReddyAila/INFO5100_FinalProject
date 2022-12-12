/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.LabRequest;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author saideepak
 */
public class LabController {

    public LabController() {
    }
    
    public ArrayList<LabRequest> getLabRequests(String name){
        ArrayList<LabRequest> labRequests = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select * from lab_requests where lab_name ='" + name + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                labRequests.add(new LabRequest(rs.getString("lab_name"), rs.getString("patient_name"), rs.getString("test_name"), rs.getString("status"), rs.getString("description"), rs.getString("date")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return labRequests;   
    }
    
    public void updateStatus(String newStatus, String date){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Update lab_requests set status='" + newStatus +  "' where date='" + date + "'";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
    public void insertLabRequest(String lab, String name, String testName, String status, String description, String date){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Insert into `lab_requests`" + "values('" + lab + "','" + name + "','" + testName + "','" + status + "','" + description + "','" + date + "')";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
    
    
}
