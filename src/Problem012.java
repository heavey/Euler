/**
 * Created by aliceheavey on 05/03/15.
 * What is the value of the first triangle
 * number to have over five hundred divisors?
 */
public class Problem012 {

    public static void main(String[] args) {
        long n = 0l;
        long i = 1l;
        boolean found = false;

        int best = 0;

        while (!found && i > 0) {
            n +=i;
            int divs = 0;
            for (int j = 1; j*j <= n; j++) {
                if (n % j == 0) {
                    divs++;
                    if (j*j != n) divs++;
                }
            }
            if (divs > best) {
                best = divs;
                System.out.println(n + " divisors: " + best);
            }

            if (divs > 500) found = true;
            else i++;
        }
        System.out.println(n);
    }
}
