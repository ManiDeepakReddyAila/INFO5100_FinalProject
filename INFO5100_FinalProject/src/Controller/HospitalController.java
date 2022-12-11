/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.HospitalRequests;
import Models.LabRequest;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author manideepakreddyaila
 */
public class HospitalController {
    
    public ArrayList<HospitalRequests> getHospitalRequests(String name){
        ArrayList<HospitalRequests> hospitalRequests = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select * from hospital_requests where hospital_name = '" +name + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                hospitalRequests.add(new HospitalRequests(rs.getString("hospital_name"), rs.getString("patient_name"), rs.getString("report_date"), rs.getString("lab_name"), rs.getString("test_name"), rs.getString("status"), rs.getString("description")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hospitalRequests;
    }
    
    public void updateStatus(String newStatus, String date){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Update hospital_requests set status='" + newStatus + "' where report_date='" + date + "'";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
    public void updateSugestion(String suggestion, String patientName){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Update `patient_report` set suggestion = '" + suggestion + "' where name = '" + patientName + "'";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
    public void insertHospitalRequest(String hospitalName, String patientName, String date, String labName, String testName, String status, String description){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Insert into `hospital_requests`" + "values('" + hospitalName + "','" + patientName + "','" + date + "','" + labName + "','" + testName + "','" + status + "','" + description + "')";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
}
