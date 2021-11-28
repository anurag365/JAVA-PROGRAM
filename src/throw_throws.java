import java.util.Scanner;

public class throw_throws {

    public int divide(int a,int b) throws ArithmeticException {

        int result = a / b;
            return result;
    

    }

    public static void main(String[] args) {

        try {
            int c = divide();
            System.out.println(c);

        } catch (Exception e) {
            System.out.println("EXCEPTION");
        }

    }

}
