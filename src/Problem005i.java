/**
 * 21/04/15. Because Armada.
 */
public class Problem005i {

    public static void main(String[] args) {

        // give multiple start value 1
        long multiple = 1l;

        for (long i = 1l; i <= 36; i++) {

            // rem = remainder of multiple / i
            long rem = multiple % i;

            // if rem != 0 multiple is not divisible by i, fix this
            if (rem != 0) {

                // while i is not divisible by rem, rem = remainder of i / rem
                while (i % rem != 0) {
                    rem = i % rem;
                }
                multiple *= (i / rem);
            }

            System.out.println(i + "    " + multiple + "    " + rem);
        }
    }
}
