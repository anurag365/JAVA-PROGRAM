class Class{
  int a;

  public int getA(){
      return a;
  }

  Class(int g){
      this.a=g;
  }

}

public class this_super_class {
    public static void main(String[] args){

        Class c=new Class(2);
        System.out.println(c.getA());
        //System.out.println(c.baba());




    }


}
