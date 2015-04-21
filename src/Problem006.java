/**
 * Created by Alice on 05/03/15.
 * Find the difference between the sum of the
 * squares of the first one hundred natural
 * numbers and the square of the sum.
 */
public class Problem006 {

    public static void main(String[] args) {
        long sumNu = 0l;
        long sumSq = 0l;

        for (int i = 1; i <= 100; i++) {
            sumNu += i;
            sumSq += i * i;
        }

        System.out.println(sumNu * sumNu - sumSq);
    }
}
