 
  class MyThr2 extends Thread{
    
    public void run(){
        int j=25;
        while(j<500){
        System.out.println("thanku");
        j++;
        }       
    }
}
 
 
 
 
 
 public class method_thead {
 public static void main(String[] args)
    {
       Mythr2  t1= new Mythr2();
       MyThr2 t2=new MyThr2();
       t1.start();
       try{
   
        t1.join();
       }
       catch(Exception e){
           System.out.println(e);
       }

       t2.start();
      


    }
}
