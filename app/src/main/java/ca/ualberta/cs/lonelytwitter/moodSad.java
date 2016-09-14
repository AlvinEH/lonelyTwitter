package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by alvin on 9/13/2016.
 */
public class moodSad extends moodCurrent {

    public moodSad(){
        super();
    }

    public moodSad(Date date){
        super(date);
    }

    public String moodCurrent() {
        return "Sad";
    }

}
