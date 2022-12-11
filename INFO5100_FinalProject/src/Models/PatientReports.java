/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author manideepakreddyaila
 */
public class PatientReports {
    
    private String name;
    private String vitals;
    private String hg;
    private String htc;
    private String wbc;
    private String rbc;
    private String suggestion;
    private String medicines;

    public PatientReports(String name, String vitals, String hg, String htc, String wbc, String rbc, String suggestion, String medicines) {
        this.name = name;
        this.vitals = vitals;
        this.hg = hg;
        this.htc = htc;
        this.wbc = wbc;
        this.rbc = rbc;
        this.suggestion = suggestion;
        this.medicines = medicines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVitals() {
        return vitals;
    }

    public void setVitals(String vitals) {
        this.vitals = vitals;
    }

    public String getHg() {
        return hg;
    }

    public void setHg(String hg) {
        this.hg = hg;
    }

    public String getHtc() {
        return htc;
    }

    public void setHtc(String htc) {
        this.htc = htc;
    }

    public String getWbc() {
        return wbc;
    }

    public void setWbc(String wbc) {
        this.wbc = wbc;
    }

    public String getRbc() {
        return rbc;
    }

    public void setRbc(String rbc) {
        this.rbc = rbc;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public String getMedicines() {
        return medicines;
    }

    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }
    
    
    
    
}
