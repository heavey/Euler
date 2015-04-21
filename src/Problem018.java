/**
 * Created by Alice on 06/03/15.
 *
 * Find the maximum total from top to
 * bottom of the triangle below:
 */
public class Problem018 {
    private static int[][] table;
    private static final String TRIANGLE =
                    "75\n" +
                    "95 64\n" +
                    "17 47 82\n" +
                    "18 35 87 10\n" +
                    "20 04 82 47 65\n" +
                    "19 01 23 75 03 34\n" +
                    "88 02 77 73 07 63 67\n" +
                    "99 65 04 28 06 16 70 92\n" +
                    "41 41 26 56 83 40 80 70 33\n" +
                    "41 48 72 33 47 32 37 16 94 29\n" +
                    "53 71 44 65 25 43 91 52 97 51 14\n" +
                    "70 11 33 28 77 73 17 78 39 68 17 57\n" +
                    "91 71 52 38 17 14 91 43 58 50 27 29 48\n" +
                    "63 66 04 68 89 53 67 30 73 16 69 87 40 31\n" +
                    "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";

    public static void main(String[] args) {
        // Split string into rows
        String rows[] = TRIANGLE.split("\n");
        // Set int table to store numbers
        table = new int[15][0];

        // Transfers string numbers to int table (triangular)
        for (int i = 0; i < 15; i++) {
            String[] rowElements = rows[i].split("\\s");
            table[i] = new int[i+1];

            for(int j = 0; j < rowElements.length; j++) {
                table[i][j] = Integer.parseInt(rowElements[j]);
            }
        }

        System.out.println(maxPath(table, 0, 0, 0));
    }

    /**
     * Recursive crazy shit, returns max path
     */
    private static int maxPath(int[][] table, int row, int col, int sum) {
        // reached bottom of table
        sum = sum + table[row][col];
        if (row == table.length - 1) return sum;

        return Math.max(
                maxPath(table, row + 1, col, sum),
                maxPath(table, row + 1, col + 1, sum));
    }
}
