package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by alvin on 9/13/2016.
 */
public abstract class moodCurrent {
    private Date date;

    public moodCurrent(){
        this.date = new Date();
    }

    public moodCurrent(Date date) {
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public abstract String moodCurrent();
}
