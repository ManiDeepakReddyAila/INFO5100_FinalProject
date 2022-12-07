/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.Medical;

import java.util.List;

/**
 *
 * @author pranitha
 */
public class Hospitals {

    private String name;
    private String location;
    private String contactNo;
    private String address;
    private int bedCountAvail;
    private int ICUBedsAvail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBedCountAvail() {
        return bedCountAvail;
    }

    public void setBedCountAvail(int bedCountAvail) {
        this.bedCountAvail = bedCountAvail;
    }

    public int getICUBedsAvail() {
        return ICUBedsAvail;
    }

    public void setICUBedsAvail(int ICUBedsAvail) {
        this.ICUBedsAvail = ICUBedsAvail;
    }

    public List<String> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<String> doctors) {
        this.doctors = doctors;
    }

    public List<String> getStaff() {
        return staff;
    }

    public void setStaff(List<String> staff) {
        this.staff = staff;
    }
    private List<String> doctors;
    private List<String> staff;

}
