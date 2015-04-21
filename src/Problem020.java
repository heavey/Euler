import java.math.BigInteger;
import java.util.ArrayList;
import java.math.BigInteger;

/**
 * Created by aliceheavey on 06/03/15.
 *
 * Find the sum of the digits in the number 100!
 */
public class Problem020 {
    private static ArrayList<Integer> ans;

    public static void main(String[] args) {
        ans = new ArrayList<Integer>();
        ans.add(0, 1);
        int mem;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            mem = 0;
            for (int j = 0; j < ans.size() || mem != 0; j++) {
                if (j >= ans.size()) ans.add(j, mem);
                else mem += ans.get(j)*i;
                ans.set(j, mem % 10);
                mem /= 10;
            }
        }
        for (Integer i : ans) {
            sum += i;
        }
        System.out.println(sum);
    }
}
