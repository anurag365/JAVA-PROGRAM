
    
    class MyThr1 extends Thread{
        public MyThr1(String name){
            super(name);
        }
        public void run(){
            int j=25;
            while(j<500){
            System.out.println("hanku" + this.getName());
            j++;
            }       
        }
    }
    public class thread_priorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Harry1");
        MyThr1 t2 = new MyThr1("Harry2");
        MyThr1 t3 = new MyThr1("Harry3");
        MyThr1 t4 = new MyThr1("Harry4");
        MyThr1 t5 = new MyThr1("Harry5(most important)");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t5.setPriority(Thread.NORM_PRIORITY);
        
        

        

       
        }
    }
    

