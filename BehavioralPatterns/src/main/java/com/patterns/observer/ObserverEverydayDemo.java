package com.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverEverydayDemo {
  public static void main(String[] args) {
    TwitterStream messageStream = new TwitterStream();
    Client client1 = new Client("Bryan");
    Client client2 = new Client("Mark");
    
    messageStream.addObserver(client1);
    messageStream.addObserver(client2);
    messageStream.someoneTweeted();
  }
}

// concrete subject
class TwitterStream extends Observable {
  // alguien a twitteado
  public void someoneTweeted() {
    setChanged();
    notifyObservers();
  }
}

// concrete observer
class Client implements Observer {
  private String name;
  
  public Client(String name) {
    this.name = name;
  }
  
  @Override
  public void update(Observable o, Object arg) {
    System.out.println("Update " + name + "'s stream someone tweeted something.'");
  }
}