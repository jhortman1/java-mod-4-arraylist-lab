import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(-5, 4, 13, -23, -65, 5, -2));
        ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(7, 3, -3, -6, 5, 10, 8));

        ArrayList<Integer> res = mergeTwoArrayLists(l1, l2); // [4, 13, 5, 7, 3, 5, 10, 8]
        System.out.println(res);
    }

    public static ArrayList<Integer> mergeTwoArrayLists(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> newList = new ArrayList<>();
        l1.addAll(l2);
        for (Integer i:l1) {
           if(i >= 0)
           {
               newList.add(i);
           }
        }
        return newList;
    }
}
