class rohit{
    void show(){
System.out.println("First name is Rohit.");
}
}
class Parashar extends rohit{//example of single inheritance
    void lastShow(){
        System.out.println("Last name is parashar.");
    }

}
class Sir extends Parashar{//example of multilevel inheritance.
void sirshow(){
    System.out.println("Sir is calling me.");
}
}
public class MultilevelInheritance{
    public static void main(String[] args) {
        Sir s1=new Sir();
        s1.show();
        s1.lastShow();
        s1.sirshow();
    }

}