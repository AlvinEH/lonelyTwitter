package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by alvin on 9/27/2016.
 */
public class TweetList {
    List<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet) {

        if (tweets.contains(tweet)){
            throw new IllegalArgumentException();
        }

        tweets.add(tweet);

    }
    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int i) {
        return tweets.get(i);

    }

    public void removeTweet(Tweet a) {
        tweets.remove(a);
    }

    public int getCount() {
        return tweets.size();
    }


    public List<Tweet> getTweets() {
        Collections.sort(tweets, new Comparator<Tweet>() {
            public int compare(Tweet tweet1, Tweet tweet2) {
                return tweet1.getDate().compareTo(tweet2.getDate());
            }
        });
        return tweets;
    }
}
