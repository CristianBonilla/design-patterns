package com.patterns.proxy;

public class TwitterEverydayDemo {
  public static void main(String[] args) {
    TwitterService service = (TwitterService)SecurityProxyEveryday.newInstance(new TwitterServiceStub());
    System.out.println(service.getTimeline("Cristian Bonilla"));
  }
}
