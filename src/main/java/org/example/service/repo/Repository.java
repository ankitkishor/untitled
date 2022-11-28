/*
 * Author : Ankit Kishor
 * Date: 28-11-2022
 * Created with :Intellij IDEA Community Edition
 */


package org.example.service.repo;

import org.example.service.databaseService;
import org.example.service.model.DataBase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Repository
{
    DataBase dataBase1;
    Connection connection;
    databaseService data;

    public Repository() throws SQLException,ClassNotFoundException {
        data=new databaseService();
        connection=data.getConnectionToDataBase();
    }
    public List<DataBase> getAllDataBase(){
        List<DataBase> base=new ArrayList<>();
        //write a query to select all records from the table
        String selectQuery="select * from `carsales`.`salesperson`;";
        try(Statement statement=connection.createStatement()){
            ResultSet resultSet=statement.executeQuery(selectQuery);
            while (resultSet.next()){
                int salesId = resultSet.getInt("salesId");
                String name = resultSet.getString("name");
                String city = resultSet.getString("city");
                DataBase base1=new DataBase(salesId,name,city);
                base.add(base1);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return base;
    }
    public DataBase getDataBaseOfID(int salesId){
        String selectQuery="select * from `carsales`.`salesperson` where('salesId=?');";
        try(PreparedStatement statement=connection.prepareStatement(selectQuery)){
            statement.setInt(1,salesId);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                int id =resultSet.getInt("salesId");
                String name=resultSet.getString("name");
                String city=resultSet.getString("commissionRate");

                dataBase1=new DataBase(id,name,city);

            }
            return dataBase1;
        }catch (SQLException e){
            throw new RuntimeException();
        }
    }

}
