import java.util.Scanner;
import java.util.TimeZone;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class gregorian_calender {
    
    public static void main(String[] args)
    {
    Calendar c = Calendar.getInstance(); 

    System.out.println(c.getTime());

    System.out.println(c.get(Calendar.DATE));

    System.out.println(c.get(Calendar.SECOND));

    System.out.println(c.get(Calendar.HOUR));

    System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

    System.out.println(c.get(Calendar.MINUTE));


    GregorianCalendar cal =new GregorianCalendar();
    
    System.out.println(cal.isLeapYear(2024));
    System.out.println(TimeZone.getAvailableIDs(1));
    System.out.println(TimeZone.getAvailableIDs(5));
    System.out.println(TimeZone.getAvailableIDs(2));
    }
}