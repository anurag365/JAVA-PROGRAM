import java.util.Scanner;

public class specific_exception {

    public static void main(String[] args) {
        int marks[] = { 50, 7, 55 };
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the array index");
        int index = sc.nextInt();

        System.out.println("ENter the array index from which you want to divide with");

        int number = sc.nextInt();
        try {
            System.out.println("The entered array index is" + marks[index]);
            System.out.println("entered divisible array is" + marks[index] / number);

        } catch (ArithmeticException e) {
            System.out.println("Arithimetic error occured");
            System.out.println(e);
            

        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsexception");
            System.out.println(e);
            

        }

        catch (Exception e) {
            System.out.println("some other error occured");
            System.out.println(e);
            

        }
    }

}
