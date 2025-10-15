import java.util.*;
class calculate{
    public long power(int x,int y) throws Exception {
        if(x<0||y<0){
            throw new Exception ("n or p should not be negative.");
        }
        else if(x==0&&y==0){
            throw new Exception ("n and p should not be zero.");
        }
        else{
            return (long)(Math.pow(x,y));
        }
    }
}
public class Thrown {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        calculate hii=new calculate();
        int x=sc.nextInt();
        int y=sc.nextInt();
        try {
            System.out.println("result : " + hii.power(x, y));
        }
        catch(Exception e){
            System.out.println(e);
        }


    }
}
