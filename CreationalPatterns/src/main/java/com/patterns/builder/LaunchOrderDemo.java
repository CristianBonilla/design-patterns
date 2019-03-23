package com.patterns.builder;

public class LaunchOrderDemo {

  public static void main(String[] args) {
    LaunchOrder.Builder builder = new LaunchOrder.Builder();
    builder.bread("Wheat")
      .condiments("Lettuce")
      .dressing("Mustard")
      .meat("Turkey");
    
    LaunchOrder launchOrder = builder.build();
    
    System.out.println(launchOrder.getBread());
    System.out.println(launchOrder.getCondiments());
    System.out.println(launchOrder.getDressing());
    System.out.println(launchOrder.getMeat());
  }
}
