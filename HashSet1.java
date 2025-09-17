import java.util.HashSet;
public class HashSet1{
public static void main(String[] args) {
    HashSet<Integer> set1=new HashSet<>();
    //HashSet prints elements in unordered order;
    set1.add(1);
    set1.add(2);
    set1.add(3);
    set1.add(4);
    set1.add(5);
    set1.add(5);// it will not show any error 
    // it will not add duplicates.
    System.out.println("First Set : "+set1);
    HashSet<Integer> set2=new HashSet<>();
    set2.add(6);
    set2.add(5);
    set2.add(3);
    set2.add(8);
    set2.add(2);
    System.out.println("Second Set : "+set2);
    set1.addAll(set2);
    System.out.println("union : "+set1);
set1.retainAll(set2);
    System.out.println("Intersection : "+set1);
    set1.removeAll(set2);
    System.out.println("Difference : "+set1);
    set1.retainAll(set2);
    System.out.println("Intersection : "+set1);
    
}
}