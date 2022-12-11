/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Medicines;
import Models.Patients;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author manideepakreddyaila
 */
public class PatientsController {
    
    public ArrayList<Patients> getPatients(){
        ArrayList<Patients> patients = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select * from patients";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                patients.add(new Patients(rs.getString("name"), rs.getInt("age"), rs.getString("gender"),rs.getString("height"),  rs.getString("weight")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return patients;
    }
    
    public void insertPatients(String name, int age, String gender, String height, String weight){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Insert into `patients`" + "values('" + name + "','" + age + "','" + gender + "','" + height + "','" + weight + "')";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
}
