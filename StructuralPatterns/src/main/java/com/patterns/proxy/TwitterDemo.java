package com.patterns.proxy;

import java.util.Scanner;

public class TwitterDemo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    TwitterKey twitterKey = new TwitterKey();
    System.out.println("Consumer key:");
    twitterKey.setConsumerKey(scanner.nextLine());
    System.out.println("Secret key:");
    twitterKey.setSecretkey(scanner.nextLine());
    System.out.println("Access Token key:");
    twitterKey.setAccessTokenKey(scanner.nextLine());
    System.out.println("Access Token Secret Key:");
    twitterKey.setAccessTokenSecretKey(scanner.nextLine());
    
    System.out.println("Cargando...");
    
    TwitterServiceConcrete twitterServiceConcrete = new TwitterServiceConcrete(twitterKey);
    
    TwitterService service = (TwitterService)SecurityProxy.newInstance(
        twitterServiceConcrete);
    System.out.println(service.getTimeline("Cristian Bonilla"));
    
    System.out.println("Completed");

    // ocurrirá una excepción ya que restringe una validación en el interceptor de la 
    // llamada proxy por casos de seguridad
    // service.postToTimeline("Cristian Bonilla", "Patrón estructural proxy");
    
    scanner.close();
  }
}
