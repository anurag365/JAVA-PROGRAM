import java.util.ArrayList;

public class arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> A1 = new ArrayList<>();
        ArrayList<Integer> A2 = new ArrayList<>(5);
         A2.add(626);
         A2.add(66);
         A2.add(26);
         A2.add(62);
         A2.add(20);

        A1.add(9);
        A1.add(8);
        A1.add(7);
        A1.add(6);
        A1.add(1,5);//replace 1st index with 5
        A1.add(4);
        A1.add(9);
        A1.addAll(0,A2);//add the a2 array in a1 by 0 index
        A1.set(2,620);
        System.out.println(A1.contains(55));//Determine true or false which is present or not

        //A1.clear();// clears the array
        System.out.println(A1.indexOf(9));
        for (int i = 0; i < A1.size(); i++) {
            System.out.print(A1.get(i));
            System.out.print(" ,");

        }
    }

}
