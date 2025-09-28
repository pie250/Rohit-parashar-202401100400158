class demo extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            
        
        System.out.println(Thread.currentThread().getName()+" is running.");
        try {
            Thread.sleep(1);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }}
}
public class PriorityThread {
    public static void main(String[] args) {
        
    
    demo t1=new demo();
    t1.setName("Thread 1");
    t1.setPriority(3);
    demo t2=new demo();
    t1.start();
    t2.setName("Thread 2");
    t2.setPriority(2);
    t2.start();
    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.MAX_PRIORITY);

}}
