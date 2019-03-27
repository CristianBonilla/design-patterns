package com.patterns.command;

// concrete command
public class OnCommand implements Command {
  private Light light;
  
  public OnCommand(Light light) {
    this.light = light;
  }
  
  public void execute() {
    light.on();
  }
}
