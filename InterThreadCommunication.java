class Basket{
    int data;
    boolean empty=true;
    synchronized void produce(int val){
        while(!empty){
           try{ wait();}
           catch(InterruptedException e){
            System.out.println(e);

           }
        }
        empty=false;
        data=val;
        System.out.println("Produced : "+data);
        notify();
    }
    synchronized void consumed(){
        while(empty){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
        empty=true;
        System.out.println("Consumed : "+ data);
        notify();
    }}
class Producer extends Thread{
Basket b;
int data;
Producer(Basket b,int data){
    this.b=b;
    this.data=data;
}
public void run(){
    b.produce(data);
}
}
class Consumer extends Thread{
    Basket b;
    Consumer(Basket b){
        this.b=b;
    }
    public void run(){
        b.consumed();
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {
        Basket b=new Basket();
        Producer p=new Producer(b,20);
        Consumer c=new Consumer(b);
        p.start();
        c.start();
    }
}
