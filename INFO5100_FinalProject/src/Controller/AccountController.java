/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.HealthcampRequests;
import Models.Accounts;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author manideepakreddyaila
 */
public class AccountController {
    
    public ArrayList<Accounts> getHealthcampRequests(){
        ArrayList<Accounts> accountTable = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "SELECT a.*, b.test_name, b.lab_name FROM fp.healthcamp_requests a inner join fp.lab_requests b on a.patient_name = b.patient_name where a.status = 'APPROVED' and b.status='APPROVED'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                accountTable.add(new Accounts(rs.getString("patient_name"), rs.getString("lab_name"), rs.getString("test_name"), rs.getString("hospital_name"), rs.getString("healthcamp_name"), rs.getString("doctor_assigned")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accountTable; 
    }
    
}
