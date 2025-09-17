import java.util.Scanner;
public class STring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(1,4));
String s1="rohit";
String s2=new String("rohit");
String s4 =new String("rohit");
String s3="Parashar";
if(s2==s4){//checks the reference only,not values;
    System.out.println("Yes");
}
else{
    System.out.println("No");
}
      }
}
