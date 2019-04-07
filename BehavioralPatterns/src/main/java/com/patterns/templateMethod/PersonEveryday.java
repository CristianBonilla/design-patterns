package com.patterns.templateMethod;

public class PersonEveryday implements Comparable<PersonEveryday> {
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

  public int compareTo(PersonEveryday o) {
    if (age >  o.age) {
      return 1;
    }
    if (age < o.age) {
      return -1;
    }    
    return 0;
  }  
}
