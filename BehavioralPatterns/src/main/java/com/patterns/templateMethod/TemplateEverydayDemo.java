package com.patterns.templateMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemplateEverydayDemo {
  private static void printContents(List<PersonEveryday> people) {
    for (PersonEveryday person: people) {
      System.out.println(person.getName());
    }
  }
  
  public static void main(String[] args) {
    PersonEveryday bryan = new PersonEveryday("Bryan", "801-555-1212", 39);
    PersonEveryday mark = new PersonEveryday("Mark", "801-444-1234", 41);
    PersonEveryday chris = new PersonEveryday("Chris", "801-222-5151", 38);
    
    List<PersonEveryday> people = new ArrayList<>();
    people.add(bryan);
    people.add(mark);
    people.add(chris);
    
    System.out.println("Not sorted");
    printContents(people);
    
    Collections.sort(people);
    
    System.out.println("\n Sorted by age");
    printContents(people);
  }
}
