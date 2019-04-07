package com.patterns.visitor.withVisitor;

public class AtvPatsDisplayVisitor implements AtvPartVisitor {
  public void visit(Wheel wheel) {
    System.out.println("We have a wheel");
  }

  public void visit(Fender fender) {
    System.out.println("We have a fender");
  }

  public void visit(Oil oil) {
    System.out.println("We have a wheel");
  }

  public void visit(PartsOrder partsOrder) {
    System.out.println("We have an order.");
  }
}
