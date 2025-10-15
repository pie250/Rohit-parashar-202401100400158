class ThreadDemo2 implements Runnable{//Runnable interface
    public void run(){
        for(int i=0;i<10;i++){
        System.out.println(Thread.currentThread().getName()+" is running. ");
        try{Thread.sleep(3000);}//sleep method can throw InterruptedException.
        catch(InterruptedException e){
            System.out.println(e);
        }}
    }
}
//Functional interface: An interface with only one abstract method is known as functional interface.
//Runnable interface is a functional interface because it contains only one abstract method run().

public class ThreadExample2 {
    public static void main(String[] args) {
        ThreadDemo2 t1=new ThreadDemo2();
        Thread th1=new Thread(t1);
        ThreadDemo2 t2=new ThreadDemo2();
        Thread th2=new Thread(t2);
        ThreadDemo2 t3=new ThreadDemo2();
        Thread th3=new Thread(t3);
        th1.start();
        th2.start();
        th3.start();
    } 
}
