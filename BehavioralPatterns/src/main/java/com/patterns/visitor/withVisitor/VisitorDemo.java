package com.patterns.visitor.withVisitor;

public class VisitorDemo {
  public static void main(String[] args) {
    PartsOrder order = new PartsOrder();
    order.addPart(new Wheel());
    order.addPart(new Fender());
    order.addPart(new Oil());
    
    order.accept(new AtvPatsShippingVisitor());
    System.out.println();
    order.accept(new AtvPatsDisplayVisitor());
  }
}
