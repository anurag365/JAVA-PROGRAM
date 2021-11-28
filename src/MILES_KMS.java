import java.sql.SQLOutput;
import java.util.Scanner;

public class MILES_KMS {
    public static void main(String[] args){

        System.out.println("CONVERTING MILES TO KMS");
        Scanner sc= new Scanner(System.in);

        System.out.println("ENTER THE VALUE FOR WHICH YOU WANT CONVERSION OF");

          double mile = sc.nextDouble();
           double a = mile * 1.609;

        System.out.println("THE RESULTANT CONVERSION FROM MILE TO KMS IS");
        System.out.println(a +  " KMS ");





    }
}
