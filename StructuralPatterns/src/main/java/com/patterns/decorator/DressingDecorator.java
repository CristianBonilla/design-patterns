package com.patterns.decorator;

public class DressingDecorator extends SandwitchDecorator {
  public DressingDecorator(Sandwitch customSandwitch) {
    super(customSandwitch);
  }

  @Override
  public String make() {
    return customSandwitch.make() + addDressing();
  }
  
  private String addDressing() {
    return " + mustard";
  }
}
