package com.patterns.composite;

import java.util.List;
import java.util.ArrayList;

public abstract class MenuComponent {
  protected String name;
  protected String url;
  protected List<MenuComponent> menuComponents = new ArrayList<>();
  
  public String getName() {
    return name;
  }
  
  public String getUrl() {
    return url;
  }
  
  public String print(MenuComponent menuComponent) {
    StringBuilder builder = new StringBuilder(name);
    builder.append(": ")
      .append(url)
      .append("\n");
    
    return builder.toString();
  }
  
  public MenuComponent add(MenuComponent menuComponent) {
    throw new UnsupportedOperationException("Feature not implemented at this level");
  }
  
  public MenuComponent remove(MenuComponent menuComponent) {
    throw new UnsupportedOperationException("Feature not implemented at this level");
  }
  
  public abstract String toString();
}
