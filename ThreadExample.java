class Threaddemo extends Thread{//extends thread class.
    public void run(){
        for(int i=0;i<10;i++){
        System.out.println(Thread.currentThread().getName() +" is running.");
    }}
}
public class ThreadExample {
    public static void main(String[] args) {
        Threaddemo t1=new Threaddemo();
        t1.setName("First Thread");
        t1.start();
        Threaddemo t2=new Threaddemo();
        t2.setName("Second Thread");
        t2.start();

    }
}
