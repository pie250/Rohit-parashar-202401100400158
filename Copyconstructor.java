public class Copyconstructor{
String name;
int age;
String Semester;
public Copyconstructor(String name,int age,String Semester){
    this.name=name;
    this.age=age;
    this.Semester=Semester;
}
void display(){
    System.out.println("Name : "+name);
    System.out.println("Age : "+age);
    System.out.println("Semester : " +Semester);
}
public static void main(String[] args) {
    Copyconstructor c1=new Copyconstructor("Rohit",19,"3rd");
    Copyconstructor c2;
    c2=c1;
    System.out.println("Before changing : ");
    c1.display();
    System.out.println();
    c2.display();
    System.out.println();
    System.out.println("After change : ");
    c2.name="Rajat Sharma";
    c1.display();
    System.out.println();
    c2.display();
}
}