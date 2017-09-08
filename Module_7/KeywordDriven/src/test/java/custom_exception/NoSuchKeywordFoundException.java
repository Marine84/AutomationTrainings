package custom_exception;

/**
 * Created by Marine_Yegoryan on 9/8/2017.
 */
public class NoSuchKeywordFoundException extends Exception {

    public NoSuchKeywordFoundException(String message){
        super(message);
    }
}
