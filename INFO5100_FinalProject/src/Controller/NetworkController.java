/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Enterprise;
import Models.Network;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author manideepakreddyaila
 */
public class NetworkController {
    
    public ArrayList<Network> getNetworks(){
        ArrayList<Network> networks = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select * from network";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                networks.add(new Network(rs.getInt("network_id"), rs.getString("network_name")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return networks;   
    }
    
    public ArrayList<String> getNetworkNames(){
        ArrayList<String> networks = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select distinct network_name from network";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                networks.add(rs.getString("network_name"));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return networks;   
    }
    
}
