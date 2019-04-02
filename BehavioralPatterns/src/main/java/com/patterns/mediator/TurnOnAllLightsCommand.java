package com.patterns.mediator;

// concrete command
public class TurnOnAllLightsCommand implements Command {
  private Mediator mediator;
  
  public TurnOnAllLightsCommand(Mediator mediator) {
    this.mediator = mediator;
  }
  
  public void excute() {
    mediator.turnOnAllLights();
  }
}
