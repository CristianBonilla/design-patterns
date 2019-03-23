package com.patterns.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class JdbcFacade {
  private final DbSingleton instance;
  
  public JdbcFacade() {
    instance = DbSingleton.getInstance();
  }
  
  public int createTable() throws SQLException {
    Connection connection = instance.getConnection();
    Statement statement = connection.createStatement();
    int count = statement.executeUpdate("CREATE TABLE Address (" + 
        "ID Integer," + 
        "StreetName VARCHAR(20)," + 
        "City VARCHAR(20))");
    statement.close();
    // connection.close();
    
    return count;
  }
  
  public int insertIntoTable() throws SQLException {
    Connection connection = instance.getConnection();
    Statement statement = connection.createStatement();
    int count = statement.executeUpdate("INSERT INTO Address (" + 
        "ID, StreetName, City) VALUES (1, '1234 Some street', 'Layton')");
    statement.close();
    // connection.close();
    
    return count;
  }
  
  public List<Address> getAddresses() throws SQLException {
    List<Address> addresses = new ArrayList<>();
    Connection connection = instance.getConnection();
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT * FROM Address");
    
    while (resultSet.next()) {
      Address address = new Address();
      address.setId(resultSet.getString(1));
      address.setStreetName(resultSet.getString(2));
      address.setCity(resultSet.getString(3));      
      addresses.add(address);
    }    
    resultSet.close();
    statement.close();
    connection.close();
    
    return addresses;
  }
}
