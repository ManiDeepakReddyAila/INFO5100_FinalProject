/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author manideepakreddyaila
 */
public abstract class Organization {

    private String name;
    private int organizationID;
    private static int counter = 0;

    /* public enum OrgType {
        
    }*/
    public Organization(String name) {
        this.name = name;
        organizationID = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

}
