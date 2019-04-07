package com.patterns.state;

public class StateEverydayDemo {
  public static void main(String[] args) {
    FanEveryday fan = new FanEveryday();
    
    System.out.println(fan);
    
    fan.pullChain();
    
    System.out.println(fan);
    
    fan.pullChain();
    
    System.out.println(fan);
  }
}
