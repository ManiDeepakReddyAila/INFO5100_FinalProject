/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author manideepakreddyaila
 */
public class FundRaiserRequest {
    
    private String healthcampName;
    private int totalAmount;
    private String status;
    private String createdDate;
    private int amountDue;

    public FundRaiserRequest() {
    }

    public FundRaiserRequest(String healthcampName, int totalAmount, String status, String createdDate, int amountDue) {
        this.healthcampName = healthcampName;
        this.totalAmount = totalAmount;
        this.status = status;
        this.createdDate = createdDate;
        this.amountDue = amountDue;
    }

    public String getHealthcampName() {
        return healthcampName;
    }

    public void setHealthcampName(String healthcampName) {
        this.healthcampName = healthcampName;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public int getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(int amountDue) {
        this.amountDue = amountDue;
    }
    
    
    
}
