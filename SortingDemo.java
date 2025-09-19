import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class SortingDemo {
    public static void main(String[] args) {
        ArrayList<Integer> p1=new ArrayList<>();
        p1.add(5);
        p1.add(3);
        p1.add(8);
        p1.add(10);
        p1.add(1);
        System.out.println("List befor sorting : "+p1);
        Collections.sort(p1);
        //sorting algorithm used is Timsort(Merge + Insertion);
        System.out.println("List after sorting : "+p1);
        Collections.sort(p1,Collections.reverseOrder());
        System.out.println("reverse using Collections : "+p1);
        Collections.sort(p1,Comparator.naturalOrder());
        System.out.println("natural order using Collections : "+p1);
        Collections.sort(p1,Comparator.reverseOrder());
        System.out.println("Reverse order using Comparator : "+p1);
        //Comparable;
    }
}
