/**
 * Created by Alice on 05/03/15.
 * There exists exactly one Pythagorean triplet
 * for which a + b + c = 1000.
 * Find the product abc.
 */
public class Problem009 {

    public static void main(String[] args) {
        int a;
        int b;
        int c;

        for (a = 1; a < 333; a++) {
            for (b = 2; b < 1000; b++) {
                c = 1000 - a - b;
                if (a * a + b * b == c * c) System.out.println(a * b * c);
            }
        }
    }
}