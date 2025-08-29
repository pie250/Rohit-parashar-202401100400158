public class Tryexception {
    //checked exception-"compile time error".
    //unchecked exception-"run time error".

    public static void main(String[] args) {
        // we see these thinks in exception;
        //1.Exception name;
        //2.Exception description;
        //3.Stack trace;
        System.out.println(1);
        System.out.println(2);
        System.out.println(4);
        System.out.println(100/6.0);
        try{//with try either we can use catch or finally block.
        System.out.println(100/0);}
        /*catch(ArithmeticException e){
            System.out.println(e);
        }*/
        catch(ArithmeticException e){
            System.out.println("We cannot divide a number by zero.");
        }
        System.out.println(100/3);

    }
    
}
