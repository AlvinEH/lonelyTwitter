package ca.ualberta.cs.lonelytwitter;

/**
 * Created by alvin on 9/13/2016.
 */
public class ImportantTweet extends Tweet {

    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
