package Practice.Easy.DISCHAR;

/**
 * DISCHAR
 */
import java.io.*;
import java.util.HashSet;

class DISCHAR {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            char[] arr = br.readLine().toCharArray();
            HashSet<Character> hs = new HashSet<>();
            int c = 0;
            for (char ch : arr) {
                if (hs.add(ch))
                    c++;
            }
            System.out.println(c);
        }

    }

}
