package org.example.service;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        databaseService data =new databaseService();
        try {

           data.getConnectionToDataBase();
           data.printConnectionStatus();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}