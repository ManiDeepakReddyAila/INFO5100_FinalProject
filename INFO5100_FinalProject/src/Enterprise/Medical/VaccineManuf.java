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
public class VaccineManuf {

    private String name;
    private String manufactureAddress;
    private String location;
    private String contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufactureAddress() {
        return manufactureAddress;
    }

    public void setManufactureAddress(String manufactureAddress) {
        this.manufactureAddress = manufactureAddress;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<String> getVaccineAvail() {
        return vaccineAvail;
    }

    public void setVaccineAvail(List<String> vaccineAvail) {
        this.vaccineAvail = vaccineAvail;
    }

    public HashMap<String, Integer> getVaccineCountAvail() {
        return VaccineCountAvail;
    }

    public void setVaccineCountAvail(HashMap<String, Integer> VaccineCountAvail) {
        this.VaccineCountAvail = VaccineCountAvail;
    }
    private List<String> vaccineAvail;
    private HashMap<String, Integer> VaccineCountAvail;

}
