/**
 * Created by aliceheavey on 15/03/15.
 *
 * Find the value of d < 1000 for which 1/d contains
 * the longest recurring cycle in its decimal fraction part.
 */
public class Problem026 {
    public static void main(String[] args) {
        for (double i = 1; i <= 1000 ; i++) {
            System.out.println(i + " " + 1/i);
        }
    }
}
