/**
 * Created by aliceheavey on 05/03/15.
 *
 * Which starting number, under one million,
 * produces the longest Collatz sequence?
 *
 *      n → n/2 (n is even)
 *      n → 3n + 1 (n is odd)
 */
public class Problem014 {

    public static void main(String[] args) {
        int[] sec = new int[1000];  // stores sequence lengths
        int count;                  // length of current sequence
        int max = 0;                // max length so far
        int master = 0;             // starting number with longest sequence

        for (long i = 1l; i < 1000000; i++) {
            long n = i;
            count = 1;

            while (n != 1) {
                // if already know answer, get and break
                if ( n <  sec.length && i >= 0 && sec[(int) n] != 0) {
                    count += sec[(int) n] - 1;
                    break;
                }
                if (n % 2 == 0) n /= 2;
                else n = n * 3 + 1;
                count++;
            }
            // if is in range, store answer
            if (i < sec.length && i >= 0) sec[(int) i] = count;

            // if new record, store
            if (count > max) {
                max = count;
                master = (int) i;
            }
        }
        System.out.println(master + ": " + max);
    }
}
