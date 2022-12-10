/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Users.UserAccount;

/**
 *
 * @author saideepak
 * 
 */
public class AddSystem {

    public static Ecosystem configure() {
        Ecosystem addsystem = Ecosystem.getSystem();

        UserAccount userAccount = addsystem.getUserAccountDirectory().createUserAccount("Admin", "Admin123", "Admin123", "US");

        return addsystem;
    }
}
