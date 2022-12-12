/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.LabRequest;
import Models.Organization;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author manideepakreddyaila
 */
public class OrganizationController { 

    public OrganizationController() {
    }
    
    
    public ArrayList<String> getHospitalNames(){
        ArrayList<String> hospitalNames = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select name from organization where type = 'Hospital'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                hospitalNames.add(rs.getString("name"));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hospitalNames; 
    }
    
    public ArrayList<String> getEnterpriseNames(String network){
        ArrayList<String> enterpriseNames = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select distinct enterprise from organization where network ='" + network + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                enterpriseNames.add(rs.getString("enterprise"));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return enterpriseNames; 
    }
    
    public ArrayList<String> getEnterpriseTypes (String network, String enterprise){
        ArrayList<String> enterpriseTypes = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select distinct type from organization where enterprise ='" + enterprise + "' and network ='" + network + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                enterpriseTypes.add(rs.getString("type"));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return enterpriseTypes; 
    }
    
    public ArrayList<String> getLabNames(){
        ArrayList<String> labNames = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select name from organization where type = 'Lab'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                labNames.add(rs.getString("name"));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return labNames; 
    }
    
    public ArrayList<String> getDoctorNames(){
        ArrayList<String> doctorNames = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select name from organization where enterprise = 'Service' and type = 'Healthcamp' and name not like 'Doc%'";;
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                doctorNames.add(rs.getString("name"));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return doctorNames; 
    }
    
    public ArrayList<String> getDoctorNames1(){
        ArrayList<String> doctorNames = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select name from organization where enterprise = 'Service' and type = 'Healthcamp' and name like 'Doc%'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                doctorNames.add(rs.getString("name"));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return doctorNames; 
    }
    
    public void insertOrg(String name, String type, String enterprise, String network){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Insert into `organization` " + "values('" + name + "','" + type + "','" + enterprise + "','" + network + "')";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
    public ArrayList<Organization> getOrganizations(String enterprise, String network){
        ArrayList<Organization> orgNames = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select * from organization where enterprise = '" + enterprise + "' and network = '" + network + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                orgNames.add(new Organization(rs.getString("name"), rs.getString("type"), rs.getString("enterprise"), rs.getString("network")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orgNames;
    }
    
    public void deleteOrganization(String name){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Delete from `organization` where name = '" + name + "'";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
}
