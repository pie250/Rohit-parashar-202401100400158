import java.util.Scanner;
public class Method {
int salary;
String name;
void insert(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter name and salary : ");
    salary=sc.nextInt();
    name=sc.nextLine();
}
void display(){
System.out.println("Name : "+name+", Salary : "+salary);
}
    public static void main(String[] args) {
        Method m1=new Method();
        m1.insert();
        m1.display();
    }
    
}
