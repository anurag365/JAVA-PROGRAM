class circle{
    float radius;
    float π=3.144f;
    public float area(int radius){
        System.out.println("THE AREA OF CIRCLE IS .....");
        return π * radius *radius;
    }
}

class cylinder extends circle{
    float height;
    public float volume(){
        System.out.println("THE VOLUME OF THE CYLINDER IS");
        return π * radius * radius * height;
    }
}

public class practise_set_ch10 {
    public static void main(String[] args) {

        circle ci=new circle();
        System.out.println(ci.area(55));
    }
}
