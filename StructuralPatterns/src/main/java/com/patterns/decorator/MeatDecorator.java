package com.patterns.decorator;

public class MeatDecorator extends SandwitchDecorator {
  public MeatDecorator(Sandwitch customSandwitch) {
    super(customSandwitch);
  }
  
  @Override
  public String make() {
    return customSandwitch.make() + addMake();
  }
  
  private String addMake() {
    return " + turkey";
  }
}
