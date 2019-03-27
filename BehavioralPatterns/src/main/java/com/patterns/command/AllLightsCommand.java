package com.patterns.command;

import java.util.List;

// concrete command
public class AllLightsCommand implements Command {  
  private List<Light> lights;
  
  public AllLightsCommand(List<Light> lights) {
    this.lights = lights;
  }
  
  public void execute() {
    for (Light light : lights) {
      if (light.getIsOn()) {
        light.toggle();        
      }
    }
  }
}
