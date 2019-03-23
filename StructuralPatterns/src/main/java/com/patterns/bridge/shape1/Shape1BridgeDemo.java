package com.patterns.bridge.shape1;

public class Shape1BridgeDemo {

  public static void main(String[] args) {
    Circle circle = new BlueCircle();
    Square square1 = new RedSquare();
    Square square2 = new GreenSquare();
    
    circle.applyColor();
    square1.applyColor();
    square2.applyColor();
  }
}
