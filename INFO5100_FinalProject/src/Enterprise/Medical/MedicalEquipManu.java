/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.Medical;

import java.util.HashMap;

/**
 *
 * @author pranitha
 */
public class MedicalEquipManu {

    private String name;
    private String headQuarter;
    private String address;
    private String contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadQuarter() {
        return headQuarter;
    }

    public void setHeadQuarter(String headQuarter) {
        this.headQuarter = headQuarter;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMedicalEquipManu() {
        return medicalEquipManu;
    }

    public void setMedicalEquipManu(String medicalEquipManu) {
        this.medicalEquipManu = medicalEquipManu;
    }

    public HashMap<String, Integer> getMedicalEquipCount() {
        return medicalEquipCount;
    }

    public void setMedicalEquipCount(HashMap<String, Integer> medicalEquipCount) {
        this.medicalEquipCount = medicalEquipCount;
    }
    private String medicalEquipManu;
    private HashMap<String, Integer> medicalEquipCount;
}
