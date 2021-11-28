import child.child2;
import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

abstract class parent{
public void parent(){
    System.out.println("I AM A CONSTRUCTOR OF BASE 2");
 }
 public void hello(){
        System.out.println("hello");
    }


    abstract public void greet();

}

class child extends parent{
    @Override
    public void greet(){
        System.out.println("HELLO EVERY ONE GOOD MORNING");
    }

   abstract class child2 extends parent{
        public void th(){

            System.out.println("I AM A GOOD BOY");
        }
    }


}
public class abstract_classes_interfaces {
    public static void main(String[] args){

        //parent pa=new parent(); //Not allowed
        
        child ch=new child();
        System.out.println(child2);
        //child2 ch2=new child.child2(); not allowed

    }
}
