import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by aliceheavey on 12/03/15.
 *
 * What is the first term in the Fibonacci
 * sequence to contain 1000 digits?
 */
public class Problem025 {
    public static void main(String[] args) {
        ArrayList<Integer> fib1 = new ArrayList<Integer>();
        ArrayList<Integer> fib2 = new ArrayList<Integer>();
        int temp1;
        int temp2;
        int rem = 0;
        int count = 2;

        fib1.add(1);
        fib2.add(1);

        while (fib1.size() < 1000) {
            for (int i = 0; i < fib2.size() || rem > 0; i++) {
                if (fib1.size() <= i) fib1.add(0);
                temp1 = fib1.get(i);
                if (fib2.size() <= i) fib2.add(0);
                temp2 = fib2.get(i);

                fib1.set(i, (temp1 + temp2 + rem) % 10);
                fib2.set(i, temp1);

                rem = (temp1 + temp2 + rem) / 10; // forgot rem heheheh
            }
            count++;
        }
        System.out.println(count);

        /*
        BigInteger fib1 = new BigInteger("1");
        BigInteger fib2 = new BigInteger("1");
        BigInteger temp;

        long l = 2l;

        while (fib1.toString().length()<1000) {
            temp = fib1;
            fib1 = fib1.add(fib2);
            fib2 = temp;
            l++;
        }
        System.out.println(l);
         */
    }
}
