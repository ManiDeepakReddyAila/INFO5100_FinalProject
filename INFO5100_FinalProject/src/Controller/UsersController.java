/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.LabRequest;
import Models.User;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author manideepakreddyaila
 */
public class UsersController {
    
    public void insertUser(String name, String userName, String password, String network, String emailId, String enterprise, String organization, String contact){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Insert into `users`" + "values('" + name + "','" + userName + "','" + password + "','" + network + "','" + emailId + "','" + enterprise + "','" + organization + "','" + contact + "')";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
    public ArrayList<User> getUsers(){
        ArrayList<User> users = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select * from users";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                users.add(new User(rs.getString("name"), rs.getString("username"), rs.getString("password"), rs.getString("network"), rs.getString("emailId"), rs.getString("enterprise"), rs.getString("organization"), rs.getString("phone")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users; 
        
    }
    
    public ArrayList<String> getUsernames(){
        ArrayList<String> users = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select distinct username from users";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                users.add(rs.getString("username"));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users; 
        
    }
    
    public void insertIntoUsers(String name, String userName, String password, String network, String emailId, String enterprise){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Insert into `users`" + "values('" + name + "','" + userName + "','" + password + "','" + network + "','" + emailId + "','" + enterprise + "' )";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
}
