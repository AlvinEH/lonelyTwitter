package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by alvin on 9/27/2016.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
    public TweetListTest() {
        super (LonelyTwitterActivity.class);
    }
    public void testAddTweet() {
        TweetList list = new TweetList();

        Tweet tweet = new NormalTweet("Hello!");
        try {
            list.addTweet(tweet);
            list.addTweet(tweet);
            fail();
        }
        catch (IllegalArgumentException e) {
        }

    }

    public void testHasTweet() {
        TweetList list = new TweetList();

        Tweet tweet = new NormalTweet("Hello!");
        assertFalse(list.hasTweet(tweet));
        list.addTweet(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testGetTweet() {
        TweetList list = new TweetList();

        Tweet a = new NormalTweet("Hello!");
        Tweet b = new NormalTweet("Hi!");

        list.addTweet(a);
        list.addTweet(b);

        assertEquals(a, list.getTweet(0));
        assertEquals(b, list.getTweet(1));

    }
    public void testGetTweets() {
        TweetList list = new TweetList();

        Tweet a = new NormalTweet("Hello!");
        Tweet b = new NormalTweet("Hi!");

        a.getDate().setTime(1);
        list.addTweet(b);
        list.addTweet(a);

        // Check it was false -> sorted -> true
        assertFalse(list.getTweet(0).getDate().before(list.getTweet(1).getDate()));
        list.getTweets();
        assertTrue(list.getTweet(0).getDate().before(list.getTweet(1).getDate()));
    }

    public void testRemoveTweet() {
        TweetList list = new TweetList();

        Tweet a = new NormalTweet("Hello!");
        list.addTweet(a);
        assertTrue(list.hasTweet(a));

        list.removeTweet(a);
        assertFalse(list.hasTweet(a));
    }

    public void testGetCount() {
        TweetList list = new TweetList();

        Tweet a = new NormalTweet("Hello!");
        Tweet b = new NormalTweet("Hi!");

        list.addTweet(b);
        list.addTweet(a);

        assertEquals(2,list.getCount());
    }
}
