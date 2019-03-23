package com.patterns.prototype;

import java.util.Map;
import java.util.HashMap;

public class Registry {
  
  private Map<String, Item> items = new HashMap<>();
  
  public Registry() {
    loadItems();
  }
  
  public Item createItem(String type) {
    Item item = null;
    
    try {
      item = (Item)(items.get(type)).clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    
    return item;
  }
  
  private void loadItems() {
    Movie movie = new Movie();
    movie.setTitle("Basic Movie");
    movie.setPrice(24.99);
    movie.setRuntime("2 hours");
    items.put("Movie", movie);
    
    Book book = new Book();
    book.setNumberOfPages(335);
    book.setPrice(19.99);
    book.setTitle("Basic Book");
    items.put("Book", book);
  }
}
