import java.util.Scanner;
public class ExceptionThrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18){
            throw new ArithmeticException("not eligible for vote");
        }
        else{
            System.out.println("eligible for vote.");
        }
    }
    
}
