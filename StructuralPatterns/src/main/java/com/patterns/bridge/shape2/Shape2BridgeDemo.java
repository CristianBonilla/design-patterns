package com.patterns.bridge.shape2;

public class Shape2BridgeDemo {

  public static void main(String[] args) {
    Color blue = new Blue();
    Shape square1 = new Square(blue);
    
    Color red = new Red();
    Shape circle1 = new Circle(red);
    
    Color green = new Green();
    Shape circle2 = new Circle(green);
    
    Shape square2 = new Square(green);
    
    square1.applyColor();
    circle1.applyColor();
    circle2.applyColor();
    square2.applyColor();
  }
}
