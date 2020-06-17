package Practice.Begineer.PLAYSTR;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * PLAYSTR
 */
class PLAYSTR {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            char[] s1 = br.readLine().toCharArray();
            char[] s2 = br.readLine().toCharArray();
            int s1Zeros=0;
            int s2Zeros=0;
            for (int i = 0; i < n; i++) {
                if(s1[i]=='0')
                s1Zeros++;
                if(s2[i]=='0')
                s2Zeros++;
            }
            if(s1Zeros==s2Zeros)System.out.println("YES"); else System.out.println("NO");
        }
    }
}