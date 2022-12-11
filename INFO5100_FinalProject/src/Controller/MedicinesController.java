/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Medicines;
import Models.PatientReports;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author manideepakreddyaila
 */
public class MedicinesController {
    
    public ArrayList<Medicines> getMedicines(String s){
        ArrayList<Medicines> medicines = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select * from medicines where medicine_name = '" + s.split(" --- ")[0] + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                medicines.add(new Medicines(rs.getString("medicine_name"), rs.getInt("quantity"), rs.getInt("price")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return medicines;
    }
    
    public ArrayList<Medicines> getMedicines1(String medicineName){
        ArrayList<Medicines> medicines = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select * from medicines where medicine_name = '" + medicineName + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                medicines.add(new Medicines(rs.getString("medicine_name"), rs.getInt("quantity"), rs.getInt("price")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return medicines;
    }
    
    public ArrayList<Integer> getPrice(String s){
        ArrayList<Integer> price = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "SELECT price from medicines where medicine_name = '" + s.split(" --- ")[0] + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                price.add(rs.getInt("price"));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return price;
    }
    
    public void updateMedicines(int quantity, String s){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Update `medicines` set quantity = '" + String.valueOf(quantity - Integer.parseInt(s.split(" --- ")[1])) + "' where medicine_name = '" + s.split(" --- ")[0] + "'";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
    public void updateMedicines1(int quantityReq, int quantity, String medicineName){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Update `medicines` set quantity = '" + String.valueOf(quantity + quantityReq) + "' where medicine_name = '" + medicineName + "'";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
    public void updateStatus(String patientName){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Update `pharmacy_requests` set status = 'Completed' where patient_name = '" + patientName + "'";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
    public ArrayList<Medicines> getMedicines(){
        ArrayList<Medicines> medicines = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select * from medicines";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                medicines.add(new Medicines(rs.getString("medicine_name"), rs.getInt("quantity"), rs.getInt("price")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return medicines;
    }
    
}
