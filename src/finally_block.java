import java.util.Scanner;

public class finally_block {

    public static void main(String[] args) {

        try {
            int a = 4;
            int b = 0;
            int c = a /b;

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception " + " DIVIDED BY 0");
        } 
        finally 
        {
            System.out.println("END OF PROGRAM ");
        }
    }
}
