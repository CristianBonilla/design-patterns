package com.patterns.decorator;

public class DecoratorSandwitchDemo {

  public static void main(String[] args) {
    Sandwitch sandwitch = new DressingDecorator(
        new MeatDecorator(
            new SimpleSandwitch()));
    System.out.println(sandwitch.make());
  }
}
