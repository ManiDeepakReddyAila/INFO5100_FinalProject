/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

/**
 *
 * @author pranitha
 */
public class UserAccount {

    private String username;
    private String password;
    //private Role role;
    private String name;
    private String network;

   

    public UserAccount(String name, String username, String password,
            String network) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.network = network;
    }
}
