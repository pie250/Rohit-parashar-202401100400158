class Account{
     int bal=5000;
     void withdraw(int amt){
        System.out.println("Hello, sir/madam!");
        System.out.println("pin verification");
        synchronized(this){
            if(bal>=amt){
                System.out.println(Thread.currentThread().getName()+" is withdrawing "+amt);
                bal=bal-amt;
                System.out.println("Updated balance : "+bal);
            }
            else{
                System.out.println("Insufficient balance.");
            }
        }
    }
}
class Customer extends Thread{
    Account acc;
    int amt;
    Customer(Account acc,int amt){
        this.acc=acc;
        this.amt=amt;
    }
   public void run(){
        acc.withdraw(amt);
    }
}

public class SynchronizedExample2 {
    public static void main(String[] args) {
        Account t1=new Account();
        Customer c1=new Customer(t1,3000);
        Customer c2=new Customer(t1,4000);
        Customer c3=new Customer(t1,1000);
        c1.start();
        c2.start();
        c3.start();
    }
    
}
