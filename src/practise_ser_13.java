class prac13 extends Thread {
    public void run() {
        int i=0;
        while (i<100) {

            System.out.println("GOOD MORNING");

        }

    }

}

class prac131 extends Thread {
    public void run() {
        int i=0;
        while (i<100) {
            try{
            Thread.sleep(200);
            }

            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("WELCOME");

        }

    }

}

public class practise_ser_13 {

    public static void main(String[] args) {
        prac13 p =new prac13();
        prac131 r= new prac131();
        //p.setPriority(9);
        //r.setPriority(8);
        
        
        System.out.println(p.getPriority());
        System.out.println(r.getPriority());
        System.out.println(Thread.currentThread().getState());
        System.out.println(r.getState());
       // p.start();
        //r.start();


        
    }
}
