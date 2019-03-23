package com.patterns.abstractFactory;

// AbstractFactory
public abstract class CreditCardFactory {
  public static CreditCardFactory getCreditCardFactory(int creditScore) {    
    return creditScore > 650 ? 
        new AmexFactory() : 
        new VisaFactory();
  }
  
  public abstract CreditCard getCreditCard(CardType cardType);
  
  public abstract Validator getValidator(CardType cardType);
}
