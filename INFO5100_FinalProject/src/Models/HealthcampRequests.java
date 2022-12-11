/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author manideepakreddyaila
 */
public class HealthcampRequests {
    
    private String hospitalName;
    private String patientName;
    private String status;
    private String reportDate;
    private String healthcampName;
    private String doctorAssigned;

    public HealthcampRequests(String hospitalName, String patientName, String status, String reportDate, String healthcampName, String doctorAssigned) {
        this.hospitalName = hospitalName;
        this.patientName = patientName;
        this.status = status;
        this.reportDate = reportDate;
        this.healthcampName = healthcampName;
        this.doctorAssigned = doctorAssigned;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getHealthcampName() {
        return healthcampName;
    }

    public void setHealthcampName(String healthcampName) {
        this.healthcampName = healthcampName;
    }

    public String getDoctorAssigned() {
        return doctorAssigned;
    }

    public void setDoctorAssigned(String doctorAssigned) {
        this.doctorAssigned = doctorAssigned;
    }
    
    
    
    
}
