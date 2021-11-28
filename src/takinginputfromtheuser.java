import java.sql.SQLOutput;
import java.util.Scanner;


public class takinginputfromtheuser {

    public static void main(String[] args) {

        System.out.println("TAKING INPUT FROM THE USER");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1");

         float a = sc.nextFloat();

        System.out.println("Enter number 2");

        float b= sc.nextFloat();

       float  sum = a+b;

        System.out.println("The sum of the numbers are :");

        System.out.println(sum);





    }
}
