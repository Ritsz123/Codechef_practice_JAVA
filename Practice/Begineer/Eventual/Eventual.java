package Practice.Begineer.Eventual;

import java.io.*;
import java.util.HashSet;

public class Eventual {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            char[] str = br.readLine().toCharArray();
            HashSet<Character> hs = new HashSet<>();
            for (int i = 0; i < str.length; i++) {
                char ch = str[i];
                if (!hs.isEmpty() && hs.contains(ch)) {
                    hs.remove(ch);
                } else {
                    hs.add(ch);
                }
            }
            if (hs.isEmpty())
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }

}
