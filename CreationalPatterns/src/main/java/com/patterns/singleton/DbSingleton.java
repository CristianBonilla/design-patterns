package com.patterns.singleton;

import java.sql.*;
import org.apache.derby.jdbc.EmbeddedDriver;

public class DbSingleton {
	private static volatile DbSingleton instance;
	private static volatile Connection connection;
	
	private DbSingleton() {		
		 try {
			 EmbeddedDriver driver = new EmbeddedDriver();
			 DriverManager.registerDriver(driver);
		 } catch (SQLException e) {
			 e.printStackTrace();
		 }
		 
		 if (instance != null) {
			 throw new RuntimeException("Use getInstance() method to create");
		 }
		 
		 if (connection != null) {
			 throw new RuntimeException("Use getConnection() method to create");
		 }		
	}
	
	public static DbSingleton getInstance() {
		if (instance == null) {
			synchronized (DbSingleton.class) {
				if (instance == null) {
					instance = new DbSingleton();					
				}
			}
		}
		
		return instance;
	}
	
	public Connection getConnection() { 
		if (connection == null) {
			synchronized (DbSingleton.class) {
				if (connection == null) {
					try {
						String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
						connection = DriverManager.getConnection(dbUrl);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}  
		
		return connection;
	}
}
