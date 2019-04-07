package com.patterns.visitor.withVisitor;

public class Oil implements AtvPart {
  public void accept(AtvPartVisitor visitor) {
    visitor.visit(this);
  }
}
