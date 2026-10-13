/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jlab.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Jewel
 */
public class DBConnect {

    public static Connection ConnectDB() {
  String dbURL = "jdbc:sqlserver://127.0.0.1:1433;Network Library=DBMSSOCN;databaseName=JLab_Spinning;Trusted_Connection=True;";
        String user = "sa";
        String pass = "Data2025";
        Connection con = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(dbURL, user, pass);
            if (con != null) {

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DB Connection Failed");
            System.exit(0);
        }

        return con;

    }
}
