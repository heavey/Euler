/**
 * Created by aliceheavey on 05/03/15.
 * <p/>
 * Lattice paths – How many such routes
 * are there through a 20×20 grid?
 *
 * UR A FRICKIN GENIUS!!!!
 *
 * routes m * n = (m + 1)(m + 2) ... (m + n) / n!
 *
 * Alltså 40 chose 20. Whatevurrrr. Eller m + n  chose m.
 *
 */
public class Problem015 {

    public static void main(String[] args) {
        System.out.println(lattice(20, 20));
    }

    /**
     * Returns the number of lattice paths through a
     * h x v grid. O(2^n). Highly inefficient.
     * (But cute)
     *
     * @param m horizontal length (number of columns)
     * @param n vertical length (number of rows)
     * @return number of Lattice paths
     */
    private static long lattice(int m, int n) {
        long p = 1l;
        int bums = n;

        for (int i = m + n; i > m ; i--) {
            p *= i;

            while (bums > 0 && p % bums == 0) {
                p /= bums;
                bums --;
            }
        }
        return p;
    }

    /**
     * Returns the number of lattice paths through a
     * h x v grid. O(2^n). Highly inefficient.
     * (But cute)
     *
     * @param h horizontal length (number of columns)
     * @param v vertical length (number of rows)
     * @return number of Lattice paths
     */
    private static int routes(int h, int v) {
        if (h == 0) return 1;
        if (v == 0) return 1;

        return routes(h - 1, v) + routes(h, v - 1);
    }
}
