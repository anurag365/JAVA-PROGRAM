import java.util.*;
public class custom_calculator {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Press the valid number to perform operation");
        System.out.println("Press 1 for ADDITION;/n"+"Press 2 for SUBSTRACTION;/n"+"Press 3 for MULTIPLICATION;/n"+"Press 4 for DIVISION;/n");
        int N=sc.nextInt();
        
        if(N==0 || N>4){
            System.out.println("Please enter valid number");
        }else{
            System.out.println("Enter the two numbers: ");
            System.out.print("a= ");
            int a=sc.nextInt();
            System.out.print("b= ");
            int b=sc.nextInt();
            if(a>100000 || b>100000){
                System.out.println("Maximum value reached !!/n Enter value of a and b less tha 100000");
            }else{
            try{
                if(N==3 && a>7000 || b>7000){
                    System.out.println("For multiplication the value of a and b should be less than 7000");
                }else{
                switch(N){
                    case 1:System.out.println("The addition of the numbers is "+ a+b);
                    break;
                    
                    case 2:System.out.println("The substraction of the number is "+(a-b));
                    break;
                    
                    case 3:System.out.println("The multiplication of two numbers is "+(a*b));
                    break;

                    case 4:System.out.println("The division of the two numbers is "+(a/b));
                    break;
                }
            }
                }catch(Exception e){
                    System.out.println("Oopss Error Occured"+e);
            }
          }
        }
        
    
    }
    
}