import java.util.LinkedHashSet;
import java.util.TreeSet;
public class LinkedHashSet2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set1=new LinkedHashSet<>();
        //LinkedHashSet is used for ordered set;
        set1.add(1);
        set1.add(3);
        set1.add(4);
        set1.add(2);
        set1.add(5);
        TreeSet<Integer> s1=new TreeSet<>();
        //Tree set prints integer in sorted order;
        //By default it sorts elements in ascending order.
        s1.add(1);
        s1.add(3);
        s1.add(4);
        s1.add(2);
        s1.add(5);
        System.out.println("First Set using linked: "+set1);
        System.out.println("First set using Trees : "+s1);
        LinkedHashSet<Integer> set2=new LinkedHashSet<>();
        set2.add(6);
        set2.add(2);
        set2.add(5);
        set2.add(8);
        set2.add(7);
        System.out.println("Second set using Linked: "+set2);
        TreeSet<Integer> s2=new TreeSet<>();
         s2.add(6);
        s2.add(2);
        s2.add(5);
        s2.add(8);
        s2.add(7);
        System.out.println("Second set using Trees :"+s2);
    }
    