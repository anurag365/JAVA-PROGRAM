
 import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class calender_class {
   
    public static void main(String[] args)
    {
   Calendar c= Calendar.getInstance();
//Calendar c= Calendar.getInstance(TimeZone.getTimeZone("Asia/singapore"));

    
    //System.out.println(c.getCalendarType());
    //System.out.println(c.getTimeZone());
    System.out.println(c.getTimeZone().getID());
    
    
    }
}
