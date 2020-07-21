package Practice.Easy.BOJACK;

/**
 * BOJACK
 */
// This problem is a bit lot more confusing.
// need clear observation
// https://discuss.codechef.com/t/bojack-editorial/72471
// basically you just have to print a string in which one character is n times and other is n times in sequence
// ex n=2 then string will  be "aabb" 

import java.io.*;

class BOJACK {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            String ans = "";
            for (int i = 0; i < n; i++) {
                ans += 'a';
            }
            for (int i = 0; i < n; i++) {
                ans += 'b';
            }
            System.out.println(2 * n);
            System.out.println(ans);
        }
    }
}
