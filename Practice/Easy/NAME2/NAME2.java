package Practice.Easy.NAME2;

/**
 * NAME2
 */
import java.io.*;
import java.util.HashSet;

public class NAME2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            char[] ar1 = line[0].toCharArray();
            char[] ar2 = line[1].toCharArray();
            HashSet<Character> h1 = new HashSet<>();
            HashSet<Character> h2 = new HashSet<>();
            for (int i = 0; i < ar1.length; i++) {
                h1.add(ar1[i]);
            }
            for (int i = 0; i < ar2.length; i++) {
                h2.add(ar2[i]);
            }
            if (h1.containsAll(h2) || h2.containsAll(h1)) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}