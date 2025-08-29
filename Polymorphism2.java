class department{
void details(){
    System.out.println("Welcome to department section");
}
}
class Faculty extends department{
    
    void details(){//method overriding
        System.out.println("Welcome to Faculty section.");
    }
}
class Student extends Faculty{//Method overriding
void details(){
    System.out.println("Welcome to the Student section.");
}
void show(){
    System.out.println("This is the show method");
}
}

public class Polymorphism2 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.details();
        s1.show();
        Faculty f1=new Faculty();
        f1.details();
    }
}
