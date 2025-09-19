import java.util.HashMap;
import java.util.Map;
public class Hashmap1 {
    public static void main(String[] args) {
    HashMap<Integer,String> map=new HashMap<>();
    //keys should be unique;
    //HashMap allows one null key and multiple null values;
    map.put(1,"Rohit");
    map.put(2,"Rajat");
    map.put(3,"Sunny");
    map.put(4,"Shivam");
    map.put(null,"Shashi");
    map.put(6,null);
    System.out.println(map);
    System.out.println(map.get(3));
    System.out.println(map.keySet());
    System.out.println("Traversing via for each Loop");
    for(Integer k:map.keySet()){
        System.out.println(k + " : " +map.get(k));
    }
    System.out.println("Traversing via entry set.");
    for(Map.Entry<Integer,String> e:map.entrySet()){
        System.out.println(e.getKey()+" : "+e.getValue());
    }
    System.out.println(map.getOrDefault(7,"Not Found"));
    
    System.out.println("Traversing via iterator");
} 
}
