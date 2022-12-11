/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.User;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
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
