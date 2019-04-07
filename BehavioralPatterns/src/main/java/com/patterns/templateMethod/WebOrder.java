package com.patterns.templateMethod;

public class WebOrder extends OrderTemplate {
  public void doCheckout() {
    System.out.println("Get items from cart,");
    System.out.println("Get gift preferences,");
    System.out.println("Get delivery address,");
    System.out.println("Get billing address.");
  }
  
  public void doPayment() {
    System.out.println("Process payment without Card present");
  }
  
  public void doReceipt() {
    System.out.println("Ship the item to address");
  }

  public void doDelivery() {
    System.out.println("Email receipt");
  }
}
