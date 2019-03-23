package com.patterns.facade;

import java.sql.SQLException;
import java.util.List;

public class FacadeJdbcDemo {

  public static void main(String[] args) {
    try {
      JdbcFacade jdbcFacade = new JdbcFacade();
      jdbcFacade.createTable();
      System.out.println("Table created.");
      
      jdbcFacade.insertIntoTable();
      System.out.println("Record Inserted");
      
      List<Address> addresses = jdbcFacade.getAddresses();
      for (Address address : addresses) {
        System.out.println(address.getId() + " " + 
            address.getStreetName() + " " +  
            address.getCity());
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
