package com.patterns.proxy;

// POJO
public class TwitterKey {
  private String consumerKey;
  private String secretkey;
  private String accessTokenKey;
  private String accessTokenSecretKey;
  
  public String getConsumerKey() {
    return consumerKey;
  }
  
  public void setConsumerKey(String consumerKey) {
    this.consumerKey = consumerKey;
  }
  
  public String getSecretkey() {
    return secretkey;
  }
  
  public void setSecretkey(String secretkey) {
    this.secretkey = secretkey;
  }
  
  public String getAccessTokenKey() {
    return accessTokenKey;
  }
  
  public void setAccessTokenKey(String accessTokenKey) {
    this.accessTokenKey = accessTokenKey;
  }
  
  public String getAccessTokenSecretKey() {
    return accessTokenSecretKey;
  }
  
  public void setAccessTokenSecretKey(String accessTokenSecretKey) {
    this.accessTokenSecretKey = accessTokenSecretKey;
  }
}
