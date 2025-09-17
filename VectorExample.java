import java.util.Vector;
public class VectorExample {
    public static void main(String[] args) {
         Vector<String>vec=new Vector<>();
         System.out.println(vec.capacity());//By default capacity is 10;
        vec.add("Rohit");
        vec.add("Rajat");
        vec.add("Shivam");
        vec.add("Sunny");
        vec.add("Rinku");
        Vector<String>vec2=new Vector<>(3);
        System.out.println(vec2.capacity());
        vec2.add("Shashi");//add function is legacy function of java.
        vec2.add("Ranajan");
        vec2.add("Rinku");
        System.out.println(vec2.capacity());
        vec2.add("Yash");
         System.out.println(vec2.capacity());   
        //By default after occupying the initial capacity, it will double the capacity;
        Vector<Integer>vec3=new Vector<>(3,1);
        vec3.add(1);
        vec3.add(2);
        vec3.add(3);
        System.out.println(vec3.capacity());
        vec3.add(4);
        System.out.println(vec3.capacity());
      vec.addAll(vec2);
      System.out.println("First vector : "+vec);
      System.out.println("First element : "+vec.firstElement());
      System.out.println("Second Element : "+vec.lastElement());
      vec.clear();

      System.out.println("First vector after clear : "+vec);
    }
}
