package com.patterns.memento;

import java.io.Serializable;

// originator
@SuppressWarnings("serial")
public class EmployeeEverydayDemo implements Serializable {
  private String name;
  private String address;
  private String phone;
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getAddress() {
    return address;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public String getPhone() {
    return phone;
  }
  
  public void setPhone(String phone) {
    this.phone = phone;
  }
}