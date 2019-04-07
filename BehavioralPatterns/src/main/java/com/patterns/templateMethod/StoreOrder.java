package com.patterns.templateMethod;

public class StoreOrder extends OrderTemplate {
  public void doCheckout() {
    System.out.println("Ring up items from cart.");
  }

  public void doPayment() {
    System.out.println("Process payment with Card present");
  }

  public void doReceipt() {
    System.out.println("Bag items at counter");
  }

  public void doDelivery() {
    System.out.println("Print receipt");
  }
}
