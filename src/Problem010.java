import java.util.ArrayList;

/**
 * Created by Alice on 05/03/15.
 * Find the sum of all the primes below two million.
 */
public class Problem010 {

    public static void main(String[] args) {

        ArrayList<Integer> primes = new ArrayList<Integer>();
        int p = 2;
        boolean isPrime = true;
        long sum = 0l;

        while (p < 2000000) {
            for (Integer prime : primes) {
                if (p % prime == 0) {
                    isPrime = false;
                    break;
                }
                if (prime * prime > p) break;
            }
            if (isPrime) {
                primes.add(p);
                sum += p;
            }
            isPrime = true;
            p++;
        }
        System.out.println(sum);
    }
}
