import java.util.*;
import java.util.function.Predicate;
class Employee{
    String name;
    int Salary;
    Employee(String Name,int Salary){
        this.name=Name;
        this.Salary=Salary;
    }
}
public class EmployeePredicate {
    public static void main(String[] args) {
        ArrayList<Employee> emp=new ArrayList<>();
        emp.add(new Employee("Rohit",50000));
    emp.add(new Employee("Rajat",60000));
    Predicate<Employee> HighSalary=(e) -> e.Salary> 50000;
    for(Employee e:emp){
        if(HighSalary.test(e)){
    System.out.println(e.name+" has high Salary");
    }}
    }
}
