class BankAccount{
static int bal=5000;
//void withdraw(int amt)
synchronized void withdraw(int amt){//here, synchronized is using like a lock 

    if(bal>=amt){
        System.out.println(Thread.currentThread().getName()+" is withdrawing "+amt);
        bal=bal-amt;
        System.out.println("updated balance : "+bal);
    }
    else{
        System.out.println("Insufficient balance");
    }
}
}
class customer extends Thread{
    BankAccount b;
    int amt;
    customer(BankAccount b,int amt){
        this.b=b;
        this.amt=amt; 
    }
    public void run(){// (run) funcation is mandatory in class because thread can only run in run method.
        b.withdraw(amt);
    }
}
public class SynchronizedExample {
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        customer t1=new customer(b,4000);
        customer t2=new customer(b,2000);
        t1.start();
        t2.start();
        //Thread t1=new Thread();
        //Thread t2=new Thread();
    }
    
}
