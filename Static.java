public class Static{
    long id;
    final int sum=1;//final is used for declaring final value,
    //it means it can't change in whole class;
    String department;
    String name;
    static int total=0;//static member;
    //static member is shared by all the objects of a class;
    //static member is initialized only one,
    //if we will not give it any value, 
    //then it will automatic get default value of 0.
    Static(String department,String name){
        this.department=department;
        this.name=name;
        total++;
        
    }
    Static(long id){//overloading;
        this.id=id;
        total++;
    }
    static void method(){
        System.out.println("This is a static method");
        //in static method we cant directly access non static member;
    }
    void display(){
        System.out.println("ID : "+id);
        System.out.println("Department : "+department);
        System.out.println("name : "+name);
     System.out.println("Sum : "+sum);
        


    }
    public static void main(String[] args) {
        Static b1=new Static(2024011004);
        Static b2=new Static("CSE","computer science and engineering");
        b1.display();
        System.out.println();
        b2.display();
        System.out.println();
        System.out.println("Total : "+total);
        method();
       // System.out.println("Sum : "+sum);
    }
}
// a class cannot override final class;