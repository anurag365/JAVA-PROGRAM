

class Mythread extends Thread {
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("I am happy");
            System.out.println("HERO");
            i++;
        }

    }

    class Mythread1 extends Thread {
        public void run() {
            int i = 0;
            while (i < 40) {
                System.out.println("I am sad");
                System.out.println("zero");
                i++;
            }
    
        }
    
    }
}

public class thread_class {

    public static void main(String[] args) {
Mythread t1=new Mythread();
Mythread t2=new Mythread();
t2.start();
t1.start();


      
    }
}
