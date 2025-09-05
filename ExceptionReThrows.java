public class ExceptionReThrows {
    
    static void test() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside test()");
            throw e; // rethrowing
        }
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (NullPointerException e) {
            System.out.println("Caught in main");
        }
    }
}
