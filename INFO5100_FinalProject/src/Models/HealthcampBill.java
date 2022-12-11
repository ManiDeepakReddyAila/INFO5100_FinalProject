/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author manideepakreddyaila
 */
public class HealthcampBill {
    
    private String healthcampName;
    private int totalBill;

    public HealthcampBill(String healthcampName, int totalBill) {
        this.healthcampName = healthcampName;
        this.totalBill = totalBill;
    }

    public String getHealthcampName() {
        return healthcampName;
    }

    public void setHealthcampName(String healthcampName) {
        this.healthcampName = healthcampName;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }
    
    
    
}
