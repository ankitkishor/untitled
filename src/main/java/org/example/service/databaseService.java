/*
 * Author : Ankit Kishor
 * Date: 28-11-2022
 * Created with :Intellij IDEA Community Edition
 */


package org.example.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseService {
    Connection connection;
    private final String URL="jdbc:mysql://localhost:3306/carsales";
    private final String userName="root";
    private final String password="Ankit";
    private void connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/carsales","root","Ankit");


    }
   public Connection getConnectionToDataBase() throws SQLException, ClassNotFoundException {
      connect();
      return connection;
   }
   public void printConnectionStatus(){
        if(connection!=null){
            System.out.println("\u001B[32m connected \u001B[0m");
        }
        else
        {System.err.println("!! not connected !!");}
   }


}
