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
public class Insurance {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHeadQuarter() {
        return headQuarter;
    }

    public void setHeadQuarter(String headQuarter) {
        this.headQuarter = headQuarter;
    }

    public List<String> getStaff() {
        return staff;
    }

    public void setStaff(List<String> staff) {
        this.staff = staff;
    }

    public List<String> getPolicies() {
        return policies;
    }

    public void setPolicies(List<String> policies) {
        this.policies = policies;
    }
    private String headQuarter;
    private List<String> staff;
    private List<String> policies;

}
