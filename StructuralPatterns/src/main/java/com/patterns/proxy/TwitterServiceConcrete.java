package com.patterns.proxy;

import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterServiceConcrete implements TwitterService {
  private final TwitterKey twitterKey;
  
  public TwitterServiceConcrete(TwitterKey twitterKey) {
    this.twitterKey = twitterKey;
  }
  
  @Override
  public String getTimeline(String screenName) {
    ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
    configurationBuilder.setDebugEnabled(true)
      .setOAuthConsumerKey(twitterKey.getConsumerKey())
      .setOAuthConsumerSecret(twitterKey.getSecretkey())
      .setOAuthAccessToken(twitterKey.getAccessTokenKey())
      .setOAuthAccessTokenSecret(twitterKey.getAccessTokenSecretKey());
    
    TwitterFactory twitterFactory = new TwitterFactory(configurationBuilder.build());
    Twitter twitter = twitterFactory.getInstance();
    StringBuilder builder = new StringBuilder();
    try {
      Query query = new Query(screenName);
      QueryResult result;
      do {
        result = twitter.search(query);
        List<Status> tweets = result.getTweets();
        for (Status tweet : tweets) {
          builder.append("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
          builder.append("\n");
        }
      } while ((query = result.nextQuery()) != null);
    } catch (TwitterException te) {
      te.printStackTrace();
      System.out.println("Failed to search tweets: " + te.getMessage());
    }
    
    return builder.toString();
  }

  @Override
  // para casos de poner auditorías o seguridad u otras cosas por el estilo
  public void postToTimeline(String screenName, String message) {
    // we aren´t going to allow this
    System.out.println(message);
  }
}
