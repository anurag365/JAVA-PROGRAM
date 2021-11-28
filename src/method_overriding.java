import org.w3c.dom.ls.LSOutput;

class a{
    int a;
  public int anurag(){
      return 4;
  }
         public void meth2(){
             System.out.println("I AM A METHOD OF CLASS A");
  }
}
  class B extends a{

      @Override
      public void meth2(){
          System.out.println("I AM A METHOD 2 OF CLASS B");

      }

      public void meth3(){

          System.out.println("I AM A METHOD 3 OF CLASS B");
      }

    }

public class method_overriding {
    public static void main(String[] args) {
        a a=new a();
        a.meth2();
        B b=new B();
        b.meth2();
    }

}
