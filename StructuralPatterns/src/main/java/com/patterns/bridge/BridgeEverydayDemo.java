package com.patterns.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.derby.jdbc.EmbeddedDriver;

public class BridgeEverydayDemo {

  public static void main(String[] args) {
    // JDBC is an API
    try {
      DriverManager.registerDriver(new EmbeddedDriver()); // <- Driver
      String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
      Connection connection = DriverManager.getConnection(dbUrl);
      Statement statement = connection.createStatement();
      
      // Este cliente es una abstracción y puede trabajar con cualquier 
      // base de datos que tenga un controlador.
      statement.executeUpdate("CREATE TABLE Address (" + 
          "ID INT," + 
          "StreetName VARCHAR(20)," + 
          "City VARCHAR(20))");
      System.out.println("Table created.");
      
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
