import java.util.Scanner;


public class EvenOrOdd {
    public static void main(String args[]){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to check is divisible by 13 or not");
         number=sc.nextInt();
         if((number%13==0)){
             System.out.println("Divisible by 13");
         } else{
             System.out.println("Not divisible by 13");
         }
    }
}
