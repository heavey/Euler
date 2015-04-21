/**
 * Created by Alice on 05/03/15.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem004 {

    public static void main(String[] args) {

        boolean notFound = true;

        for (int i = 999999; i > 0 && notFound; i--) {
            if (isPalindrome(i)) {
                for (int j = 999; j > 99 && notFound; j--) {
                    if (i % j == 0) {
                        if (i / j > 99 && i / j < 999) {
                            notFound = false;
                            System.out.println( j + " " + i);
                        }
                    }
                }
            }
        }
    }

    /**
     * Checks whether an int number is a palindrome or not
     *
     * @param n integer to be checked
     * @return true if is palindrome, else false
     */
    private static boolean isPalindrome(int n) {
        String s = "" + n;
        int l = s.length();

        for (int i = 0; i < l/2; i++) {
            if (s.charAt(i) != s.charAt(l - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
