package com.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
  private final List<Observer> observers;
  
  public Subject() {
    observers = new ArrayList<>();
  }
  
  public void attach(Observer observer) {
    observers.add(observer);
  }
  
  public void detach(Observer observer) {
    observers.remove(observer);
  }
  
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update();
    }
  }
  
  abstract void setState(String message);
  abstract String getState();  
}
