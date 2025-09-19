import java.util.Hashtable;
public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer,String>table=new Hashtable<>();
        table.put(1,"rohit");
        //table.put(null,"rajat");//null keys are not allowed in hashtable;
        //table.put(2,null);//null values are not allowed in hashtable;
        table.put(3,"sunny");
        table.put(1,"Shivam");
        //Hashtable will override the value if key is duplicate;
        System.out.println(table);
        System.out.println(table.putIfAbsent(4,"Shashi"));
        //will return null if key is not duplicate;
        //putIfAbsent will add the key value pair if key is not present;
        System.out.println(table.putIfAbsent(3,"Rajat"));
        System.out.println(table);
    }
}
