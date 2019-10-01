package mx.horace.dp;

import mx.horace.dp.behavior.observer.CommentaryObjectObservable;
import mx.horace.dp.behavior.observer.SMSUsersObserver;
import org.junit.Test;

import static org.junit.Assert.*;

public class BehavioralTest {


    @Test
    public void testObserver(){

        CommentaryObjectObservable obj= new CommentaryObjectObservable("Soccer Match [2014AUG24]");

        SMSUsersObserver observer= new SMSUsersObserver(obj,"Adam Warner [New York]");
        SMSUsersObserver observer2= new SMSUsersObserver(obj,"Tim Ronney [London]");

        observer.subscribe();
        observer2.subscribe();

        obj.setDesc("Welcome to live Soccer match");
        obj.setDesc("Current score 0-0");

        observer.unSubscribe();
        obj.setDesc("It's goal!!");
        obj.setDesc("Current score 1-0");



        assertTrue(true);
    }

}
