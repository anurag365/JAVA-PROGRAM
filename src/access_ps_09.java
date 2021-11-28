import org.w3c.dom.ls.LSOutput;

//class cylinder{
//    int height;
//    int radius;
//    float pi=3.14f;
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public int getRadius() {
//        return radius;
//    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//    public float surfacearea(){
//        return 2*pi*radius*height+2*pi*radius*radius;
//    }
//
//    public float volume(){
//        return pi*radius*radius*height;
//    }

    class rectangle{
       private int length;
        private int bredth;

        public  rectangle(){
            this.length=4;
            this.bredth=5;
        }

        public int getLength() {
            return length;
        }

        public int getBredth() {
            return bredth;
        }
    }

public class access_ps_09 {
    public static void main(String[] args) {


        //prob-1 and prob-2
//        cylinder cy = new cylinder();
//        cy.setRadius(4);
//        cy.setHeight(6);
//        System.out.println(cy.surfacearea());
//        System.out.println(cy.volume());

        rectangle r=new rectangle();
        System.out.println(r.getBredth());
        System.out.println(r.getLength());
    }
}