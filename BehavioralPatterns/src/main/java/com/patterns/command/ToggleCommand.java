package com.patterns.command;

// concrete command
public class ToggleCommand implements Command {
  private Light light;  
  
  public ToggleCommand(Light light) {
    this.light = light;
  }
  
  public void execute() {
    light.toggle();
  }
}
