import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class date_time_fromatter {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        // LocalDate d =LocalDate.now();
        // System.out.println(d);

        // LocalTime t =LocalTime.now();
        // System.out.println(t);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-mm-yyyy--E a");
        String date =dt.format(dtf);
        System.out.println(date);

        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_DATE;
        String date1 = dt.format(dtf2);
        System.out.println(date);
    }
}
  