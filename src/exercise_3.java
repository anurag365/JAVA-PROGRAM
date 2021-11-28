import java.util.Scanner;
import java.util.Random;
public class exercise_3 {
    public static void main(String[] args) {

        game Guessthegame=new game();
        Guessthegame.play();


    }
}

class game {
    int numberOfguesses;
    int userinput;
    int computerinput;

    public game() {
        Random rand = new Random();
        computerinput = rand.nextInt(100);
    }

    public void Userinput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER YOU WANT TO GUESS BETWEEN 1-100");
        userinput = sc.nextInt();
    }

    public int numberOfguesses() {
        return numberOfguesses;
    }

    public boolean Correctnumber() {
        if (userinput == computerinput) {
            return false;
        } else {
            return true;
        }
    }

    public void play() {
        System.out.println("DECIDE THE NUMBER BETWEEN 1-100");


        while (Correctnumber()) {

            Userinput();

            if (userinput > computerinput) {
                System.out.println("THE NUMBER IS BIGGER");
            } else if (userinput < computerinput) {
                System.out.println("THE NUMBER IS SMALLER");
            }

            numberOfguesses++;

        }
        System.out.printf("CONGO YOU HAVE DONT IT IN %d NUMBER OF GUESSES",numberOfguesses);

    }


}
