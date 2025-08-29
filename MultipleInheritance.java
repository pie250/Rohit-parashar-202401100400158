interface College{
    void exam();// abstarct methods cannot have body.
}
interface University{
    void exam();
}
class kiet implements College,University{
    public void exam(){
        System.out.println("Exam details are available.");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        College c1;
        c1=new kiet();
        c1.exam();
    }
}
