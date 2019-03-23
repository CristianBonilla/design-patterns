package com.patterns.decorator;

public abstract class SandwitchDecorator implements Sandwitch {
  protected Sandwitch customSandwitch;
  
  public SandwitchDecorator(Sandwitch customSandwitch) {
    this.customSandwitch = customSandwitch;
  }
  
  public String make() {
    return customSandwitch.make();
  };
}
