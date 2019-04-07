package com.patterns.templateMethod;

public abstract class OrderTemplate { // sistema de pedidos
  public boolean isGift; // es un regalo
  
  public final void wrapGift() {
    System.out.println("Gift wrapped.");
  }
  
  public final void processOrder() {
    doCheckout();
    doPayment();
    if (isGift) {
      wrapGift();
    } else {
      doReceipt();      
    }
    doDelivery();
  }
  
  public abstract void doCheckout();
  
  public abstract void doPayment();
  
  public abstract void doReceipt();
  
  public abstract void doDelivery();
}
