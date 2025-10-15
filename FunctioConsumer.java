import java.util.*;
import java.util.function.Consumer;
class Employee{
    String name;
    int Salary;
    Employee(String Name,int Salary){
        this.name=Name;
        this.Salary=Salary;

    }
}
public class FunctioConsumer {
   public static void main(String[] args) {
    ArrayList<Employee> emp=new ArrayList<>();
    emp.add(new Employee("Rohit",50000));
    emp.add(new Employee("Rajat",60000));
    Consumer<Employee> giveBonus=(e) -> e.Salary+=10000;
    Consumer<Employee> display=(e) ->
    System.out.println(e.name+" => "+e.Salary);
    emp.forEach(giveBonus);
    emp.forEach(display);
   } 
}
