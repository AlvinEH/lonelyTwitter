package ca.ualberta.cs.lonelytwitter;

/**
 * Created by alvin on 9/13/2016.
 */
public class NormalTweet extends Tweet implements Tweetable {

    public NormalTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
