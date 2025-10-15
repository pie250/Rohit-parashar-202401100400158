//Functional interface using lambda expression.
interface Bird{
    void fly();
}
public class LambdaDemo {
    public static void main(String[] args) {
    Bird b=new Bird(){
        public void fly(){
            System.out.println("using anonymous class.");
        }
    };
    //b.fly();
     Bird c=()->{System.out.println("Using lambda expression");
     //b.fly();
     };
     c.fly();
}}
