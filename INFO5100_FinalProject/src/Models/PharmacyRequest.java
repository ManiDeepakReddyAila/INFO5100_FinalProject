/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author saideepak
 */
public class PharmacyRequest {
    
    private String patientName;
    private String medicines;
    private String doctorName;
    private String healthcampName;
    private String status;

    public PharmacyRequest(String patientName, String medicines, String doctorName, String healthcampName, String status) {
        this.patientName = patientName;
        this.medicines = medicines;
        this.doctorName = doctorName;
        this.healthcampName = healthcampName;
        this.status = status;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getMedicines() {
        return medicines;
    }

    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getHealthcampName() {
        return healthcampName;
    }

    public void setHealthcampName(String healthcampName) {
        this.healthcampName = healthcampName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
