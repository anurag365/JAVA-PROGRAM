import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class file_handling {

    public static void main(String[] args) {

        // creating new file

        // File myfile = new File("anurag111.txt");
        // try {
        // myfile.createNewFile();
        // } catch (IOException e) {

        // System.out.println("unable to print new file");
        // e.printStackTrace();
        // }

        // code to write to a file
        // try {
        // FileWriter f = new FileWriter("anurag111.txt");

        // FileWriter.write("Hello world");
        // FileWriter.close();

        // } catch (IOException e) {
        // System.out.println("UNABLE TO WRITE ON FILE");
        // e.printStackTrace();
        // }

        // reding a file

        // File myfile = new File("this.txt");

        // try {
        //     Scanner sc = new Scanner(myfile);
        //     while (sc.hasNextLine()) {
        //         String line = sc.nextLine();
        //         System.out.println(line);
        //     }
        //     sc.close();
        // } catch (FileNotFoundException e) {
        //     System.out.println("FILE NOT FOUND");
        //     e.printStackTrace();
        // }

        // deleting a file

        File myfile = new File("this.txt");
        if(myfile.delete()){
            System.out.println("I HAVE DELEATED" + myfile.delete());
        }else{
            System.out.println("Some error occured");

        }

    }
}
