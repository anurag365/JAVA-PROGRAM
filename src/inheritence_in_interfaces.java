import java.util.Scanner;

interface atm{

   void process1();
    void process2();

}
interface atm2 extends atm{
      void process3();
      void process4();

}

class atm3 implements atm2{

    public void process1(){

        System.out.println("ENTERING ATM.....");
    }

    public void process2(){

        System.out.println("ENTERING CARD AND PROCESSING.....");
    }

    public void process3(){

        System.out.println("RECEIVING MONEY.....");
    }

    public void process4(){

        System.out.println("GOING HOME.....");
    }


}



public class inheritence_in_interfaces {
    
    public static void main(String[] args)
    {

        atm3 at=new atm3();
         at.process1();
         at.process2();
         at.process3();
         at.process4();
    

    }
}
