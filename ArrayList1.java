import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add(1,"Grapes");
        fruits.set(2,"Orange");
        System.out.println(fruits);
        for(String s:fruits){
            System.out.println(s);
        }
        System.out.println(fruits.get(2));

    /*ArrayList Sports=new ArrayList();
        Sports.add("Cricket");
        Sports.add("Badminton");
        Sports.add("Volleyball");*/
        //above method is showing some error at that moment;
        Iterator it=fruits.iterator();
        System.out.println();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        fruits.add(1,"Hello");
        System.out.println(fruits);
        Collections.sort(fruits);
        System.out.println(fruits);
        
    }
}
