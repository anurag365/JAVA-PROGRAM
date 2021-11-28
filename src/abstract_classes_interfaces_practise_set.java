import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

//prob-1 &prob-2

abstract class Pen{

   abstract void write();
    abstract void refill();
}

class Fountainpen extends Pen{
       void write(){
      System.out.println("WRITING ROM THE PEN......");

       }

       void refill(){
           System.out.println("REFILLING THE PEN.....");
       }

       void changenib(){
           System.out.println("CHANGING THE NIB.....");
       }

}

//prob-3

class Monkey{
    public  void jump(){

        System.out.println("JUMPING......");
    }
    public void bite(){

        System.out.println("BITING......");
    }


    interface basicAnimal{
        void eat();
        void sleep();
    }

    class Human extends Monkey implements basicAnimal{
        void speak(){
                
            System.out.println("SPEAKING....");
        }

      public void eat(){

            System.out.println("DABA KE EATING.....");
        }

        public void sleep(){
            System.out.println("DABA KE SLEEPING....");
        }
        
    }

}

public class abstract_classes_interfaces_practise_set {
      public static void main(String[] args)
   {
         Fountainpen fount=new Fountainpen();
         fount.refill();
         fount.changenib(); 
         Human hn=new Human();
         hn.eat();
         hn.sleep();
         hn.speak();

   } 
}
