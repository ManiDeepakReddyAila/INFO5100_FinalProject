/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Notification;
import Models.Patients;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author manideepakreddyaila
 */
public class NotificationController {
    
    public void insertNotification(String sender, String receiver, String read, String message, String date){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Insert into `notifications`" + "values('" + sender + "','" + receiver + "','" + read + "','" + message + "','" + date + "')";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
    public ArrayList<Notification> getNotifications(){
        ArrayList<Notification> notifications = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select * from notifications";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                notifications.add(new Notification(rs.getString("sender"),rs.getString("receiver"), rs.getString("read"), rs.getString("message"),rs.getString("date")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return notifications;
    }
    
    public void updateRead(String date){
        System.out.println("hello" + date);
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Update notifications set `read`='1' where date='" + date + "'";
            System.out.println(query);
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
}
