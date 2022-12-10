/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author manideepakreddyaila
 */
public class ConnectioinManager {
    
    private static String url = "jdbc:mysql://localhost:3306/fp?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static String username = "root";
    private static String password = "Deepak@1999";
    private static Connection con;

    public static Connection getConnection() throws Exception {
      con = DriverManager.getConnection(url, username, password);
        return con;
    }
    
}
