interface college{
    void register();
    void fee();
    void staff();
    default void medicalfacility(){//concrete method in interface using default keyword.
        System.out.println("Medical facilities are available for students");
    }
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
}
public class InterfaceConcrete {
  public static void main(String[] args) {
    college c1;
    c1=new DU();
    c1.register();
    c1.fee();
    c1.staff();
    c1.medicalfacility();
  }  
}
