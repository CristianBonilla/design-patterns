package com.patterns.iterator;

// import java.util.List;
// import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class IteratorEverydayDemo {
  public static void main(String[] args) {
    // List<String> names = new ArrayList<>();
    Set<String> names = new HashSet<>();
    
    names.add("Bryan");
    names.add("Aaron");
    names.add("Jason");
    
    // for (int i = 0; i < names.size(); i++) {
    //   String name = names.get(i);
    //   System.out.println(name);
    // }
    
    // for (String name : names) {
    //   System.out.println(name);
    // }
    
    Iterator<String> namesIterator = names.iterator();    
    while (namesIterator.hasNext()) {
      String name = namesIterator.next();
      System.out.println(name);
      namesIterator.remove();
    }
    
    System.out.println("Names size: " + names.size());
  }
}
