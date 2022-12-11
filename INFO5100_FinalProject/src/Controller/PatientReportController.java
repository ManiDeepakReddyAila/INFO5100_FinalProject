/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.PatientReports;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author manideepakreddyaila
 */
public class PatientReportController {
    
    public ArrayList<PatientReports> getPatientReports(String name){
        ArrayList<PatientReports> patientReports = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select * from patient_report where name = '" + name + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                patientReports.add(new PatientReports(rs.getString("name"), rs.getString("vitals"), rs.getString("hg"), rs.getString("htc"), rs.getString("wbc"), rs.getString("rbc"), rs.getString("suggestion"), rs.getString("medicines")));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return patientReports;
    }
    
    public boolean checkIfExists(String name){
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select * from patient_report where name = '" + name + "'";
            ResultSet rs = statement.executeQuery(query);
            if(!rs.next()){
                rs.close();
                return true;
            }
            
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void updateMedicines(String medicines, String patientName){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Update patient_report set medicines='" + medicines + "' where name='" + patientName + "'";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
    public ArrayList<String> getMedicinesFromPatientReports(String name){
        ArrayList<String> medicinesPatientReports = new ArrayList<>();
        try {
            Statement statement = ConnectioinManager.getConnection().createStatement();
            String query = "select medicines from patient_report where name = '" + name + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                medicinesPatientReports.add(rs.getString("medicines"));
            }
            rs.close();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return medicinesPatientReports;
    }
    
    public void insertPatientReport(String name, String vitals, String hg, String htc, String wbc, String rbc){
        try {
            Statement myStatement = ConnectioinManager.getConnection().createStatement();
            String query = "Insert into `patient_report` " + "values('" + name + "','" + vitals + "','" + hg + "','" + htc + "','" + wbc + "','" + rbc + "','','')";
            myStatement.executeUpdate(query);

        } catch (Exception E) {
            
        }
    }
    
}
