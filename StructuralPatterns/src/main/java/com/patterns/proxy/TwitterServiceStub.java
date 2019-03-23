package com.patterns.proxy;

public class TwitterServiceStub implements TwitterService {
  public String getTimeline(String screenName) {
     return "My timeline";
  }

  public void postToTimeline(String screenName, String message) {
    
  }
}
