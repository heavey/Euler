/**
 * Created by aliceheavey on 06/03/15.
 *
 * If all the numbers from 1 to 1000 (one thousand)
 * inclusive were written out in words, how many
 * letters would be used?
 *
 * ugly af
 */
public class Problem017 {

    public static void main(String[] args) {

        int sum = 0;

        // five hundred and fifty five

        for (int i = 1; i <= 1000; i++) {
            int n = i;

            switch (n / 1000) {
                case 1:     sum += 11;
                            break;
                default:    break;
            }

            n = n % 1000;

            switch (n / 100) {
                case 1:     sum += 10 + 3;
                            break;
                case 2:     sum += 10 + 3;
                            break;
                case 3:     sum += 12 + 3;
                            break;
                case 4:     sum += 11 + 3;
                            break;
                case 5:     sum += 11 + 3;
                            break;
                case 6:     sum += 10 + 3;
                            break;
                case 7:     sum += 12 + 3;
                            break;
                case 8:     sum += 12 + 3;
                            break;
                case 9:     sum += 11 + 3;
                            break;
                default:    break;
            }

            n = n % 100;

            if (n == 0 && i != 1000) sum -= 3;

            switch (n / 10) {
                case 2:     sum += 6;
                            break;
                case 3:     sum += 6;
                            break;
                case 4:     sum += 5;
                            break;
                case 5:     sum += 5;
                            break;
                case 6:     sum += 5;
                            break;
                case 7:     sum += 7;
                            break;
                case 8:     sum += 6;
                            break;
                case 9:     sum += 6;
                            break;
                default:    break;
            }

            if (n > 9 && n < 20) {
                switch (n) {
                    case 10:    sum += 3;
                                break;
                    case 11:    sum += 6;
                                break;
                    case 12:    sum += 6;
                                break;
                    case 13:    sum += 8;
                                break;
                    case 14:    sum += 8;
                                break;
                    case 15:    sum += 7;
                                break;
                    case 16:    sum += 7;
                                break;
                    case 17:    sum += 9;
                                break;
                    case 18:    sum += 8;
                                break;
                    case 19:    sum += 8;
                                break;
                    default:    break;
                }
            } else { switch (n % 10) {
                case 1:     sum += 3;
                            break;
                case 2:     sum += 3;
                            break;
                case 3:     sum += 5;
                            break;
                case 4:     sum += 4;
                            break;
                case 5:     sum += 4;
                            break;
                case 6:     sum += 3;
                            break;
                case 7:     sum += 5;
                            break;
                case 8:     sum += 5;
                            break;
                case 9:     sum += 4;
                            break;
                default:    break;
                }
            }
        }
        System.out.println(sum);
    }
}
