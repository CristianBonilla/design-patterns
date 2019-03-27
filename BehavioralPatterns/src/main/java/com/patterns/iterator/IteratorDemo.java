package com.patterns.iterator;

// import java.util.Iterator;

public class IteratorDemo {

  public static void main(String[] args) {
    BikeRepository repository = new BikeRepository();
    repository.addBike("Cervelo");
    repository.addBike("Scott");
    repository.addBike("Fuji");
    
    // Iterator<String> bikeIterator = repository.iterator();
    
    // while (bikeIterator.hasNext()) {
    //   System.out.println(bikeIterator.next());      
    // }
    
    for (String bike : repository) {
      System.out.println(bike);
    }
  }
}
