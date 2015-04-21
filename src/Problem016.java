/**
 * Created by aliceheavey on 05/03/15.
 *
 * What is the sum of the digits of the number 2 to the power of 1000?
 */
public class Problem016 {
    private static int[] number;

    public static void main(String[] args) {
        number = new int[302];
        number[0] = 1;
        int n = 0;
        int sum = 0;

        for (int i = 0; i < 1000; i++) {

            for (int j = 0; j < number.length; j++) {
                n = n + number[j] * 2;
                number[j] = n % 10;
                n /= 10;
            }
        }

        for(int i : number) {
            sum += i;
        }
        System.out.println(sum);
    }
}
