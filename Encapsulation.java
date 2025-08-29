import java.util.Scanner;
class Employee{
    private int salary;
    private int pin=977034;

public void setbalance(int salary1){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your pin : ");
    int i=sc.nextInt();
    if(i==pin){
        salary=salary1;
        System.out.println("Balance is updated.");
        
    }
    else{
        System.out.println("wrong pin! ");
    }
}
public void getbalance(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your pin to fetch balance : ");
    int i=sc.nextInt();
    if(i==pin){
        System.out.println("Your balance is : "+salary);
    }
    else{
        System.out.println("wrong pin! Access denied");
    }
}}
public class Encapsulation {
    public static void main(String[] args) {
    Employee e1=new Employee();
    e1.setbalance(112222);
    e1.getbalance();
    }
    
}
