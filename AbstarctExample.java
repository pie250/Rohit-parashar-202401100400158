abstract class College{// in abstarct it achives(0-100)% abstraction.
    abstract void register();//abstarct method
    abstract void fee();//abstarct method
    abstract void Staff();//abstarct method
    void medicalFacilities(){//concrete method
        System.out.println("Medical facilities are available");

    }

}
class Kiet extends College{
    void register(){
        System.out.println("Student registeration done.");
    }
    void fee(){
        System.out.println("Fees payment done.");
    }
    void Staff(){
        System.out.println("Staff details are available.");
    }
/*void medicalFacilities(){//optional method overriding
    System.out.println("Medical facilities are available for students.");
}*/
}
public class AbstarctExample {
public static void main(String[] args) {
    College c1;
    //College c2=new College();// we cannot create object of abstarct class;
    Kiet c2=new Kiet();
    c2.medicalFacilities();//multilevel inheritance
    c1=new Kiet();
    c1.register();
    c1.fee();
    c1.Staff();
    c1.medicalFacilities();// multilevel inheritance
    

}
    
}
