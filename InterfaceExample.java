


interface college{// interface is used for 100 % abstraction.
    // it has only abstract methods.
    void register();//abstract method.
    void fee();//abstarct method.
    void staff();//abstract method.
    void medicalfacility();//abstract method.
// all methods in interface are by default public and abstarct.
// after java 8 we can create concrete method in interface using default and static keyword.
// after java 9 we can create private method in interface.
int min=100;
// all variables in interface are by default public,static and final.
}
class DU implements college{
public void register(){
    System.out.println("Student registeration done.");
}
public void fee(){
    System.out.println("Student fees payment done.");
}
public void staff(){
    System.out.println("Staff details are available");
}
public void medicalfacility(){
System.out.println("Medical facilities are available for students.");
}
}
public class InterfaceExample {
    public static void main(String[] args) {
        
    
    college c1=new DU();
    //college c1=new college();//also, we cannot create object of interface.
    c1.register();
    c1.fee();
    c1.staff();
    c1.medicalfacility();

}}
