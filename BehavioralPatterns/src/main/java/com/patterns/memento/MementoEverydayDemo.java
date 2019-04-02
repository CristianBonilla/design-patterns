package com.patterns.memento;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MementoEverydayDemo {
  public static void main(String[] args) {
    EmployeeEverydayDemo employee = new EmployeeEverydayDemo();
    employee.setName("Bryan Hansen");
    employee.setAddress("111 E Code Street");
    employee.setPhone("888-555-1212");
    
    serialize(employee);
    EmployeeEverydayDemo newEmployee = deserialize();
    
    System.out.println(newEmployee.getName());
  }
  
  private static void serialize(EmployeeEverydayDemo employee) {
    try {
      FileOutputStream fileOutput = new FileOutputStream("tmp/employee.ser");
      ObjectOutputStream out = new ObjectOutputStream(fileOutput);
      out.writeObject(employee);
      out.close();
      fileOutput.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  private static EmployeeEverydayDemo deserialize() {
    EmployeeEverydayDemo employee = null;
    try {
      FileInputStream fileInput = new FileInputStream("tmp/employee.ser");
      ObjectInputStream input = new ObjectInputStream(fileInput);
      employee = (EmployeeEverydayDemo)input.readObject();
      input.close();
      fileInput.close();
    } catch (ClassNotFoundException | IOException e) {
      e.printStackTrace();
    }
    
    return employee;
  }
}
