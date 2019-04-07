package com.patterns.observer;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject {

  private Deque<String> messageHistory;
  
  public MessageStream() {
    messageHistory = new ArrayDeque<>();
  }
  
  @Override
  void setState(String message) {   
    messageHistory.add(message);
    notifyObservers();
  }

  @Override
  String getState() {
    return messageHistory.getLast();
  }
}
