package com.patterns.strategy;

public class PersonEveryday {
  private int age;
  private String name;
  private String phoneNumber;
  
  public PersonEveryday() { }
  
  public PersonEveryday(String name, String phoneNumber, int age) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.age = age;
  }
  
  public int getAge() {
    return age;
  }
  
  public String getName() {
    return name;
  }
  
  public String getPhoneNumber() {
    return phoneNumber;
  }
}
