import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class java_time {
    
    public static void main(String[] args)
    {
    LocalDate d= LocalDate.now();//prints the latest date 
    System.out.println(d);

    LocalTime t = LocalTime.now();//prints the latest time
    System.out.println(t);
    
    LocalDateTime lt = LocalDateTime.now();
    System.out.println(lt);//prints date as well as time(nanoseconds also)

    }
}
