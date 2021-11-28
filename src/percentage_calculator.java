
  import com.sun.security.jgss.GSSUtil;

  import java.util.Scanner;
   public class percentage_calculator{
       public static void main(String[] args){

           System.out.println("ENTER THE MARKS OF ALL THE 5 SUBJECTS");
           Scanner sc = new Scanner(System.in);

               System.out.println("NOTE: THE MARKS OBTAINED IN EACH SUBJECT SHOULD BE OUT OF 100 !");
           System.out.println("ENTER THE MARKS OF HINDI");
           float a= sc.nextFloat();

           System.out.println("ENTER THE MARKS OF ENGLISH");
           float b= sc.nextFloat();

           System.out.println("ENTER THE MARKS OF MATHS");
           float c= sc.nextFloat();

           System.out.println("ENTER THE MARKS OF SCIENCE");
           float d= sc.nextFloat();

           System.out.println("ENTER THE MARKS OF SOCIAL SCIENCE");
           float e =sc.nextFloat();

           float f=a+b+c+d+e;
           float g= f*100/500;
           System.out.println("THE PERCENTAGE IS ");
           System.out.println(g);






       }

   }
