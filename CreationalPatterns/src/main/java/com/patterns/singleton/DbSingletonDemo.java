package com.patterns.singleton;

import java.sql.*;
import java.sql.SQLException;

public class DbSingletonDemo {

	public static void main(String[] args) {
		DbSingleton instance = DbSingleton.getInstance();
				
		// DbSingleton anotherInstance = DbSingleton.getInstance();		
		// System.out.println(anotherInstance);
		
		long timeBefore = 0;
		long timeAfter = 0;
		
		System.out.println(instance);
		
		timeBefore = System.currentTimeMillis();
		Connection connection = instance.getConnection();
		timeAfter = System.currentTimeMillis();
		
		System.out.println(timeAfter - timeBefore);
		
		Statement statement;
		try {
			statement = connection.createStatement();
			statement.executeUpdate("CREATE TABLE Address (" + 
					"ID INT," +
					"StreetName VARCHAR(20)," + 
					"City VARCHAR(20))");
			System.out.println("Table created.");
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		timeBefore = System.currentTimeMillis();
		connection = instance.getConnection();
		timeAfter = System.currentTimeMillis();
		
		System.out.println(timeAfter - timeBefore);		
	}
}
