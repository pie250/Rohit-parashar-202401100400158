public class Copyconstructor2 {
     String name;
     int age;
     String Semester;

     public Copyconstructor2(String name,int age,String Semester){
        this.name=name;
        this.age=age;
        this.Semester=Semester;
     }
     public Copyconstructor2(Copyconstructor2 c){
        this.name=c.name;
        this.age=c.age;
        this.Semester=c.Semester;
     }
     void display(){
        System.out.println("Name : "+ name);
        System.out.println("Age : "+age);
        System.out.println("Semester : "+Semester);

     }
public static void main(String[] args) {
    Copyconstructor2 c1=new Copyconstructor2("rohit",20,"3rd");
    Copyconstructor2 c2=new Copyconstructor2(c1);
    c2.name="Rohit Parashar";
    c1.display();
    c2.display();
}
    
}
