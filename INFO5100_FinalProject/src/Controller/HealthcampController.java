/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.FundRaiserRequest;
import Models.HealthcampRequests;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author pranitha
 */
public class HealthcampController {
    
    public void insertHealthcampRequests(String hospitalName, String patientName, String status, String date, String healthcampName, String doctorAssigned){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Insert into `healthcamp_requests`" + "values('" + hospitalName + "','" + patientName + "','" + status + "','" + date + "','" + healthcampName + "','" + doctorAssigned + "')";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
    public ArrayList<HealthcampRequests> getHealthcampRequests(){
        ArrayList<HealthcampRequests> healthcampRequests = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select * from healthcamp_requests";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                healthcampRequests.add(new HealthcampRequests(rs.getString("hospital_name"), rs.getString("patient_name"), rs.getString("status"), rs.getString("report_date"), rs.getString("healthcamp_name"), rs.getString("doctor_assigned")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return healthcampRequests; 
    }
    
    public ArrayList<HealthcampRequests> getHealthcampRequests(String doctorAssigned){
        ArrayList<HealthcampRequests> healthcampRequests = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select * from healthcamp_requests where doctor_assigned = '" + doctorAssigned + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                healthcampRequests.add(new HealthcampRequests(rs.getString("hospital_name"), rs.getString("patient_name"), rs.getString("status"), rs.getString("report_date"), rs.getString("healthcamp_name"), rs.getString("doctor_assigned")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return healthcampRequests; 
    }
    
    public void updateStatus(String newStatus, String date){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Update healthcamp_requests set status='"+ newStatus +"' where report_date='" + date + "'";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
    public void updateDoctorAssigned(String doctorAssigned, String patientName){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Update healthcamp_requests set doctor_assigned='" + doctorAssigned + "' where report_date='" + patientName + "'";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
}
