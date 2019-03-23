package com.patterns.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

  public static void main(String[] args) {
    DbSingleton instance = DbSingleton.getInstance();
    
    try {
      Connection connection = instance.getConnection();
      Statement statement = connection.createStatement();
      int count = statement.executeUpdate("CREATE TABLE Address (" + 
          "ID Integer," + 
          "StreetName VARCHAR(20)," + 
          "City VARCHAR(20))");
      System.out.println("Table created!");
      statement.close();
      
      statement = connection.createStatement();
      count = statement.executeUpdate("INSERT INTO Address (" + 
          "ID, StreetName, City) VALUES (1, '1234 Some street', 'Layton')");
      System.out.println(count + " record(s) created.");
      statement.close();
      
      statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery("SELECT * FROM Address");
      
      while (resultSet.next()) {
        System.out.println(resultSet.getString(1) + " " + 
            resultSet.getString(2) + " " + 
            resultSet.getString(3));
      }
      resultSet.close();
      statement.close();
      connection.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
