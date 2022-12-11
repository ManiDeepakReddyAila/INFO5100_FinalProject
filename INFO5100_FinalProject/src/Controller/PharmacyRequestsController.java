/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.HospitalRequests;
import Models.PharmacyRequest;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author manideepakreddyaila
 */
public class PharmacyRequestsController {
    
    public void insertPharmacyRequests(String patientName, String medicines, String doctorName, String healthcampName, String status){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Insert into `pharmacy_requests`" + "values('" + patientName + "','" + medicines + "','" + doctorName + "','" + healthcampName + "','" + status + "')";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
    public ArrayList<PharmacyRequest> getPharmacyRequests(){
        ArrayList<PharmacyRequest> pharmacyRequests = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "Select * from pharmacy_requests";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                pharmacyRequests.add(new PharmacyRequest(rs.getString("patient_name"), rs.getString("medicines"), rs.getString("doctor_name"), rs.getString("healthcamp_name"), rs.getString("status")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pharmacyRequests;
    }
    
    public ArrayList<String> getStatus(String patientName){
        ArrayList<String> pharmacyRequests = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select status from pharmacy_requests where patient_name = '" + patientName + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                pharmacyRequests.add(rs.getString("status"));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pharmacyRequests;
    }
    
}
