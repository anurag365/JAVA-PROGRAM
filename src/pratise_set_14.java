import java.util.Scanner;

public class pratise_set_14 {
    
    public static void main(String[] args)
    {
    try {
    int a=6/0;
    
    }catch(IllegalArgumentException e){
        System.out.println("AHAH");
    }
    catch(ArithmeticException e){
        System.out.println("HEHE");
    }
    }
}
