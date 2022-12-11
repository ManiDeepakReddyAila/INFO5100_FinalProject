/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author manideepakreddyaila
 */
public class AdminRequests {
    
    private String healthcampName;
    private int numberOfBeds;
    private String requestedBy;
    private String date;
    private String status;

    public AdminRequests(String healthcampName, int numberOfBeds, String requestedBy, String date, String status) {
        this.healthcampName = healthcampName;
        this.numberOfBeds = numberOfBeds;
        this.requestedBy = requestedBy;
        this.date = date;
        this.status = status;
    }

    public String getHealthcampName() {
        return healthcampName;
    }

    public void setHealthcampName(String healthcampName) {
        this.healthcampName = healthcampName;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
