// import java.security.Identity;
// import java.util.Scanner;

// class Anurag22 {

//     public int id;
//     public String name;

//     public Anurag22() {
//       id=45;
//       name="anurag";
//       System.out.println(name);
//     }

// }

// public class output {
//     public static void main(String[] args) {

//        Anurag22 hb =new Anurag22();

//     }
// }

import java.util.Scanner;

public class output {
    int a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int a = sc.nextInt();
        if ((a % 400 == 0) || (a % 4 == 0) && (a % 100 != 0)) {
            System.out.println("It is leap year");
        }
            else{
                System.out.println("not the leap year");
            
        }
    }
}