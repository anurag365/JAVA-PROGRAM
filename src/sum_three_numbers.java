import java.util.Scanner;

public class sum_three_numbers {
public static void main(String[] args){

    System.out.println("SUM OF THREE NUMBERS");
    Scanner sc= new Scanner(System.in);

    System.out.println("ENTER THE FIRST NUMBER");
    float a = sc.nextFloat();

    System.out.println("ENTER THE SECOND NUMBER");
    float b= sc.nextFloat();

    System.out.println("ENTER THE THIRD NUMBER");
    float c= sc.nextFloat();

    float  d=a+b+c;

    System.out.println("THE SUM OF THE THREE NUMBERS ARE");
    System.out.println(d);
}
    }
