package com.patterns.flyweight;

public class FlyweightEverydayDemo {

  public static void main(String[] args) {
    Integer firstInt = Integer.valueOf(5);
    Integer secondInt = Integer.valueOf(5);
    Integer thirdInt = Integer.valueOf(10);    
    
    System.out.println(System.identityHashCode(firstInt));
    System.out.println(System.identityHashCode(secondInt));
    System.out.println(System.identityHashCode(thirdInt));
    // el tercero es una dirección diferente y eso es porque el 
    // el primero lo está creando y almacenando en la agrupación literal,
    // la segunda simplemente la saca de esa agrupación literal o esa
    // caché de peso mosca (flyweight) y luego la tercera crea un nuevo
    // objeto y también lo recupera de la caché.
  }
}
