package com.patterns.proxy;

public class TwitterDemo {
  public static void main(String[] args) {
    TwitterService twitterService = (TwitterService)SecurityProxy.newInstance(
        new TwitterServiceStub());
    
    System.out.println(twitterService.getTimeline("bh5k"));
  }
}
