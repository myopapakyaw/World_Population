package com.worldpopulation;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Class Name : Main
 * Author: aaa
 * Date: asf
 * Description: Collection Test
 */

public class Main {

    // Connection
    // Statement / PrepareStatement
    // ResultSet -> index starts at 1.

    private Connection getConnection(String ipaddress, int portno, String dbname, String username, String password) {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://" + ipaddress + ":" + portno + "/" + dbname, username, password);
            System.out.println("Successfull Connection");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;

    }

    public static void main(String[] args) {
        Main m = new Main();
        Connection con = m.getConnection("localhost", 3306, "world_population", "root", "");

    }
}