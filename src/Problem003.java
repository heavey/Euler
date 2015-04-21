import java.util.ArrayList;

/**
 * Created by Alice on 04/03/15.
 * Find largest prime factor of 600851475143.
 */
public class Problem003 {
    private static long n;
    private static long p;

    /**
     * Finds largest prime factor efficiently
     */
    public static void main(String[] args) {
        n = 600851475143l;
        p = 2;

        while (p < n) {
            while (n % p != 0) p++;
            n /= p;
        }
        System.out.println(p);
    }
}