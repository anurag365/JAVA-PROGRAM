
public class try_catch {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);

        } catch (Exception e) {
            System.out.println("FAILED TO DIVIDE & REASON IS");
            System.out.println(e);

        }
    }
}