import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by aliceheavey on 06/03/15.
 *
 * Begin by sorting it into alphabetical order. Then working
 * out the alphabetical value for each name, multiply this
 * value by its alphabetical position in the list to obtain
 * a name score.
 *
 * For example, when the list is sorted into
 * alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9+
 * 14 = 53, is the 938th name in the list. So, COLIN would
 * obtain a score of 938 × 53 = 49714.
 *
 * What is the total of all the name scores in the file?
 */
public class Problem022 {
    private static final String[] NAMES = {};

    public static void main(String[] args) throws IOException{
        String[] names = readFile();
        Arrays.sort(names);
        //for (String s : names) System.out.println(s);
        int[] v = new int[names.length];
        int sum = 0;

        for (int i = 0; i < names.length; i++) {
            for (int j = 1; j < names[i].length() - 1; j++) {
                char c = names[i].charAt(j);
                v[i] += Character.getNumericValue(c) - 9;
            }
            sum += v[i] * (i + 1);
        }

        System.out.println(sum);
    }

    private static void swap(String[] v, int a, int b) {
        String temp = v[a];
        v[a] = v[b];
        v[b] = temp;
    }

    /**
     * Created by Eric on 2015-03-06.
     */
    private static String[] readFile() throws IOException{
        //statisk array storlek (typ array[5000] eller en arraylist eller dylikt)
        String[] array;
        FileInputStream file = new FileInputStream("p022_names.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(file));
        try {
            String content = br.readLine();
            array = content.split("\\,"); //osäker på regex, men du fattar principen.
        } finally {br.close();}
        return array;
    }
}
