package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by alvin on 9/13/2016.
 */
public interface Tweetable{
    public String getMessage();
    public Date getdate();

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
