/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.Medical;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author pranitha
 */
public class BloodBank {

    private String location;
    private String name;
    private String contact;
    private List<String> availBloodGroup;
    private List<String> donors;
    private List<String> patientList;
    private HashMap<String, Integer> bloodCountAvail;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<String> getAvailBloodGroup() {
        return availBloodGroup;
    }

    public void setAvailBloodGroup(List<String> availBloodGroup) {
        this.availBloodGroup = availBloodGroup;
    }

    public List<String> getDonors() {
        return donors;
    }

    public void setDonors(List<String> donors) {
        this.donors = donors;
    }

    public List<String> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<String> patientList) {
        this.patientList = patientList;
    }

    public HashMap<String, Integer> getBloodCountAvail() {
        return bloodCountAvail;
    }

    public void setBloodCountAvail(HashMap<String, Integer> bloodCountAvail) {
        this.bloodCountAvail = bloodCountAvail;
    }

}
