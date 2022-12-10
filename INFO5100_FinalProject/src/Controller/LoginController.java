/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Classes.User;
import Organization.ClothingRetailerScreen.Hospital;
import Organization.TransportScreens.Healthcamp;
import Organization.TransportScreens.HealthcampDoctor;
import Organization.VaccineManufacturers.Pharmacy;
import Organization.WarehouseScreens.Lab;
import Screens.HierarchyManage;
import UI.Login;
import UI.createRequests;
import UIMedicalEnterprise.Bloodbank.Sponsor;
import UIMedicalEnterprise.MedicalEquipManuf.Account;
import VoluntaryEnterprise.Fundraiser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author manideepakreddyaila
 */
public class LoginController {
    
    private ArrayList<User> users;
    static Logger log = Logger.getLogger(LoginController.class.getName());

    public LoginController() {
        this.users = new ArrayList<>();
    }
    
    public ArrayList<User> getUsers(){
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "Select * from users";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                users.add(new User(rs.getString("username"), rs.getString("password"), rs.getString("organization")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;   
    }
   
    
    
}
