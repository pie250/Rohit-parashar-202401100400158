class Overloading {
    //overloading
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }}
public class Polymorphism{
    public static void main(String[] args) {
        Overloading Sum=new Overloading();
        System.out.println(Sum.add(2,8));
        System.out.println(Sum.add(2,8,10));
        System.out.println(Sum.add(2.5,9.5));





        
    }
    
}
