/**
 * Created by aliceheavey on 06/03/15.
 *
 * Evaluate the sum of all the amicable numbers under 10000.
 */
public class Problem021 {

    public static void main(String[] args) {
        // All numbers has the divisor 1.
        int sum1;
        int sum2;

        int tot = 0;

        for (int i = 2; i < 10000; i++) {
            sum1 = 1;
            sum2 = 1;

            for (int j = 2; j * j <= i; j++){
                if (i % j == 0) sum1 += j + i / j;
                if (j * j == i) sum1 -= j;
            }
            if (sum1 != i) {
                for (int j = 2; j * j <= sum1; j++) {
                    if (sum1 % j == 0) sum2 += j + sum1 / j;
                    if (j * j == sum1) sum2 -= j;
                }
            }
            if (sum2 == i) tot += i;
        }
        System.out.println(tot);
        System.out.println("done");
    }
}
