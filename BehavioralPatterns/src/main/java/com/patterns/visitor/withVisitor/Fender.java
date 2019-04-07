package com.patterns.visitor.withVisitor;

public class Fender implements AtvPart {
  public void accept(AtvPartVisitor visitor) {
    visitor.visit(this);
  }
}
