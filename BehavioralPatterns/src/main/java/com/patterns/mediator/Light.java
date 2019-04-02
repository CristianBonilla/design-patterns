package com.patterns.mediator;

// receiver
public class Light {
  private boolean isOn = false;
  private String location = "";
  
  public Light() {}
  
  public Light(String location) {
    this.location = location;
  }
  
  public boolean getIsOn() {
    return isOn;
  }
  
  public void toggle() {
    if (isOn) {
      off();
      isOn = false;
    } else {
      on();
      isOn = true;
    }
  }
  
  public void on() {
    System.out.println(location + " switched on.");
  }
  
  public void off() {
    System.out.println(location + " switched off.");
  }
}
