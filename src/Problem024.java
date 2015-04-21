import java.util.LinkedList;

/**
 * Created by aliceheavey on 12/03/15.
 *
 * What is the millionth lexicographic permutation
 * of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 *
 *
 */
public class Problem024 {
    private static LinkedList<Integer> list;
    public static void main(String[] args) {
        list = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) list.add(i);

        int m = 999999;
        int n;

        for (int i = 9; i >= 0; i--) {
            n = m / factorial(i);
            System.out.print(list.remove(n));
            m %= factorial(i);
        }
    }

    private static int factorial(int n) {
        int f = 1;
        for (int i = n; i > 1; i--) {
            f *= i;
        }
        return f;
    }
}
