import java.util.ArrayList;

/**
 * Created by Alice on 05/03/15.
 * What is the 10 001st prime number?
 */
public class Problem007 {
    private static ArrayList<Long> primes;

    public static void main(String[] args) {
        primeArray(10001);

        System.out.println(primes.get(10000));
    }

    /**
     * Returns an ArrayList containing the first n
     * primes stored as Long objects.
     */
    private static ArrayList<Long> primeArray(int n) {
        primes = new ArrayList<Long>();
        long p = 2l;
        boolean isPrime = true;

        while (primes.size() < n) {
            for (Long prime : primes) {
                if (p % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) primes.add(p);
            isPrime = true;
            p++;
        }
        return primes;
    }
}
