/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author manideepakreddyaila
 */
public class Accounts {
    
    private String patientName;
    private String lab;
    private String testName;
    private String hospitalName;
    private String healthcampName;
    private String doctor;

    public Accounts(String patientName, String lab, String testName, String hospitalName, String healthcampName, String doctor) {
        this.patientName = patientName;
        this.lab = lab;
        this.testName = testName;
        this.hospitalName = hospitalName;
        this.healthcampName = healthcampName;
        this.doctor = doctor;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHealthcampName() {
        return healthcampName;
    }

    public void setHealthcampName(String healthcampName) {
        this.healthcampName = healthcampName;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }    
    
}
