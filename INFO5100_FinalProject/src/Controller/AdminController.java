/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.AdminRequests;
import Models.LabRequest;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author manideepakreddyaila
 */
public class AdminController {
    public void insertLabRequest(String healthcampName, int nob, String requestedBy, String date, String status){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Insert into `admin_requests`" + "values('" + healthcampName + "'," + nob + ",'" + requestedBy + "','" + date + "','" + status + "')";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
    public ArrayList<AdminRequests> getAdminRequests(){
        ArrayList<AdminRequests> adminRequests = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select * from admin_requests";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                adminRequests.add(new AdminRequests(rs.getString("healthcamp_name"), rs.getInt("number_of_beds"), rs.getString("requested_by"), rs.getString("date"), rs.getString("status")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return adminRequests;   
    }
    
    public void updateStatus(String newStatus, String healthcampName){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Update admin_requests set status='" + newStatus +  "' where healthcamp_name='" + healthcampName + "'";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
}
