package com.patterns.mediator;

// concrete command
public class TurnOffAllLightsCommand implements Command {
  private Mediator mediator;  
  
  public TurnOffAllLightsCommand(Mediator mediator) {
    this.mediator = mediator;
  }
  
  public void excute() {
    mediator.turnOffAllLights();
  }
}