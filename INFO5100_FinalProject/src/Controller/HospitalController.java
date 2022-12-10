/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Classes.HospitalRequests;
import Classes.LabRequest;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author manideepakreddyaila
 */
public class HospitalController {
    
    public ArrayList<HospitalRequests> getHospitalRequests(){
        ArrayList<HospitalRequests> hospitalRequests = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select * from lab_requests";
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
    
}
