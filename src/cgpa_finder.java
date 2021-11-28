import java.util.Scanner;
public class cgpa_finder{
    public static void main(String[] args){

        System.out.println("ENTER THE MARKS OF THE 6 SUBJECTS");
        Scanner sc= new Scanner(System.in);

        System.out.println("ENTER THE MARKS OF FIRST SUBJECT");
        float a= sc.nextFloat();

        System.out.println("ENTER THE MARKS OF THE SECOND SUBJECT");
        float b = sc.nextFloat();

        System.out.println("ENTER THE MARKS OF THE THIRD SUBJECT");
        float c= sc.nextFloat();

        System.out.println("ENTER THE MARKS OF THE FOURTH SUBJECT");
        float d= sc.nextFloat();

        System.out.println("ENTER THE MARKS OF THE FIFTH SUBJECT");
        float e= sc.nextFloat();

        System.out.println("ENTER THE MARKS OF THE SIXTH SUBJECT");
        float f= sc.nextFloat();

        float g = (a+b+c+d+e+f)/60;

        System.out.println("THE CGPA IS");
        System.out.println(g);

    }


}
