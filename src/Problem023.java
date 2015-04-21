import java.util.ArrayList;

/**
 * Created by aliceheavey on 12/03/15.
 *
 * A number n is called deficient if the sum of its
 * proper divisors is less than n and it is called
 * abundant if this sum exceeds n.
 *
 * Find the sum of all the positive integers which
 * cannot be written as the sum of two abundant numbers.
 */
public class Problem023 {
    private static ArrayList<Integer> abNums;
    private static int[] abSums;

    public static void main(String[] args) {
        setAbNums(28123);
        setAbSums();
        int masterSum = 0;

        for (int i = 1; i < 28123; i++) {
            if (abSums[i] == 0) masterSum += i;
        }
        System.out.println(masterSum);
    }

    /**
     * Set the list of abundant numbers needed
     * @param max max value of largest abundant number
     */
    private static void setAbNums(int max) {
        abNums = new ArrayList<Integer>();
        int sum;

        for (int i = 12; i <= max; i++) {
            sum = 1;
            int j;
            for (j = 2; j*j < i; j++) {
                if (i % j == 0) sum += (j + i / j);
            }
            if (j * j == i) sum += j;
            if (sum > i) abNums.add(i);
        }
    }

    private static void setAbSums(){
        abSums = new int[28123];

        for (int i = 0; i < abNums.size(); i++) {
            for (int j = 0; j <= i; j++) {
                int n = abNums.get(i) + abNums.get(j);
                if (n < 28123) abSums[n] = 1;
            }
        }
    }
}
