import java.util.ArrayList;

/**
 * Created by Alice on 05/03/15.
 * What is the smallest positive number that is evenly
 * divisible by all of the numbers from 1 to 20?
 */
public class Problem005 {
    public static void main(String[] args) {
        int n = 1;

        for (int i = 2; i <= 20; i++) {
            if (n % i != 0) {
                /*
                Basically, if n isn't divisible by current i,
                divide n by all prime factors of i that n is
                divisible by. Then n has bin stripped of factors
                in i that divides n, and n*i will be the smallest
                number divisible by 1, 2, ..., i.
                 */
                for (int j : priFac(i)) if (n % j == 0) n /= j;
                n *= i;
            }
        }
        System.out.println(n);
    }

    /**
     * Creates an ArrayList containing all prime
     * factors of a number. Multiples allowed.
     *
     * @param n number to be factorized
     * @return ArrayList with prime factors
     */
    private static ArrayList<Integer> priFac(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        int p = 2;

        while (p <= n) {
            while (n % p != 0) p++;
            n /= p;
            factors.add(p);
        }
        return factors;
    }
}
