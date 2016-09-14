package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by alvin on 9/13/2016.
 */

public abstract class Tweet {
    private ArrayList<moodCurrent> moodList = new ArrayList<moodCurrent>();

    private String message;
    private Date date;

    public Tweet(String message){
        this.message = message;
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public abstract Boolean isImportant();

    public void moodAdding(moodCurrent mood) {
        moodList.add(mood);
    }

    public void setMessage(String message) {
        if (message.length() > 140) {
            // Do something to raise an exception
            throw new TweetTooLongException();
        }
        this.message = message;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

}
