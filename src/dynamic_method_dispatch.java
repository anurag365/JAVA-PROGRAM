

class phone{
    public void welcome(){
        System.out.println("GOOD MORNING");
    }

    public void name(){
        System.out.println("MY NAME IS JAVA");
    }

}

class smartphone extends phone{
    public void greet(){
        System.out.println("SUSWAGATAM");
    }
    public void name(){
        System.out.println("MY NAME IS JAVA OF CLASS SMARTPHONE");
    }

}

public class dynamic_method_dispatch {

    public static void main(String[] args) {

        //phone ph=new phone();
        phone ph=new smartphone();
        ph.name();

    }
}
