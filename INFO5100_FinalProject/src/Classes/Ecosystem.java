/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author aesha
 */
public class Ecosystem extends Organization {

    private static Ecosystem ecosystem;
    private ArrayList<Network> networklist;

    public static Ecosystem getSystem() {
        if (ecosystem == null) {
            ecosystem = new Ecosystem();
        }
        return ecosystem;
    }

    private Ecosystem() {
        super(null);
        networklist = new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworklist() {
        return networklist;
    }

    public void setNetworklist(ArrayList<Network> networklist) {
        this.networklist = networklist;
    }

}
