package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by alvin on 9/13/2016.
 */
public class moodDepressed extends moodCurrent {

    public moodDepressed(){
        super();
    }

    public moodDepressed(Date date){
        super(date);
    }

    public String moodCurrent(){
        return "Depressed";
    }
}
