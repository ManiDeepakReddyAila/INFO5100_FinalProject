/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author aesha
 */
public class User extends Person {

    private String name;
    private String username;
    private String password;
    private String network;
    private String emailId;
    private String enterprise;
    private String organization;
    private String phone;

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User(String name, String username, String password, String network, String emailId, String enterprise, String organization, String phone) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.network = network;
        this.emailId = emailId;
        this.enterprise = enterprise;
        this.organization = organization;
        this.phone = phone;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public String getOrganization() {
        return organization;
    }

    public User(String username, String password, String organization) {
        this.username = username;
        this.password = password;
        this.organization = organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

}
