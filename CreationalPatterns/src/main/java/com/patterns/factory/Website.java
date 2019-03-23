package com.patterns.factory;

import java.util.List;
import java.util.ArrayList;

public abstract class Website {
  protected List<Page> pages = new ArrayList<>();
  
  public Website() {
    this.createWebsite();
  }

  public List<Page> getPages() {
    return pages;
  }

  public void setPages(List<Page> pages) {
    this.pages = pages;
  }
  
  public abstract void createWebsite();
}
