package com.patterns.adapter;

import java.util.List;
import java.util.ArrayList;

public class EmployeeClient {
  public List<Employee> getEmployeeList() {
    List<Employee> employees = new ArrayList<>();
    Employee employeeFromDB = new EmployeeDB("1234", "Cristian", "Bonilla", "cristiancamilo10_95@outlook.com");
    employees.add(employeeFromDB);
    
    // No trabajará! aquí es donde el adaptador entra en juego
    // Employee employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
    EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
    
    employees.add(new EmployeeAdapterLdap(employeeFromLdap));
    
    EmployeeCSV employeeFromCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@hotmail.com");
    
    employees.add(new EmployeeAdapterCSV(employeeFromCSV));
    
    return employees;
  }
}
