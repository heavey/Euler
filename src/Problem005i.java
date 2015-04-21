/**
 * 21/04/15. Because Armada.
 */
public class Problem005i {

    public static void main(String[] args) {

        // give multiple start value 1
        long multiple = 1l;

        for (long i = 1l; i <= 27; i++) {

            // rem = remainder of multiple / i
            long rem = multiple % i;

            // if rem != 0 multiple is not divisible by i, fix this
            if (rem != 0) {

                // rem2 = remainder of i / first remainder
                long rem2 = i % rem;

                // if i is divisible by first remainder,
                // multiply multiple by i / first remainder
                if (rem2 == 0) {
                    multiple *= (i / rem);
                } else {
                    // while remainder of
                    while (i % rem2 != 0) {
                        rem2 = i % rem2;
                    }
                    multiple *= (i / rem2);
                }
            }

            System.out.println(i + "    " + multiple + "    " + rem);
        }
    }
}
