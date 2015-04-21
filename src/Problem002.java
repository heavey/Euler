/**
 * Created by Alice on 04/03/15.
 * Sum of even Fibonacci numbers not exceeding four million
 */
public class Problem002 {

    public static void main(String[] args) {
        int lastFib = 1;
        int currFib = 1;
        int sum = 0;

        while (currFib < 4000000) {
            currFib += lastFib;
            lastFib = currFib - lastFib;

            if (currFib % 2 == 0) sum += currFib;
        }
        System.out.println(sum);
    }
}
