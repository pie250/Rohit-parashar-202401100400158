import java.util.Random;
import java.util.function.Supplier;
public class RandomNumberSupplier {
    public static void main(String[] args) {
        Random random=new Random();
        Supplier<Integer> rn=()->random.nextInt(100);
        System.out.println("random number: "+rn.get());
        System.out.println("Another random number: "+rn.get());
        }
}
