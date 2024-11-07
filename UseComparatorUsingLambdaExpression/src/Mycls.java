import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mycls {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(0);
        list.add(99);
        list.add(6);
        //Collections.sort(list,new Maini1());
        // instead of this we write lambda expression
        Collections.sort(list,(a,b)->b-a);
        System.out.println(list);
    }
}
