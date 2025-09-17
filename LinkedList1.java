import java.util.Iterator;
import java.util.LinkedList;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> emp=new LinkedList<>();
        emp.add("John");
        emp.add(1,"Raj");
        emp.add(2,"Sophia");
        emp.addFirst("Rohit");
        emp.addLast("Rajat");
        emp.add("John");
        emp.add("Sophia");
        System.out.println("Employees List : "+emp);
        for(String s:emp){
            System.out.println(s);
        }
        System.out.println();
        System.out.println(emp.getFirst());
        System.out.println(emp.getLast());
        Iterator it=emp.iterator();
        System.out.println();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        emp.remove();//removing the first object.
        emp.remove("Sophia");//removing the "Sophia" object
        emp.remove(2);
        System.out.println(emp);
        System.out.println(emp.indexOf("John"));
        System.out.println(emp.lastIndexOf("John"));
    }
}
