package Practice.Begineer.ADACRA;

import java.io.*;
/**
 * ADACRA
 */
class ADACRA {

    public static void main(String[] args) throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            char[] s = br.readLine().toCharArray();
            int uCount=0; int dCount=0;
            for (int i = 0; i < s.length-1; i++) {
                if(s[i]=='U' && s[i]!=s[i+1]){
                    uCount++;
                }else if (s[i]=='D' && s[i]!=s[i+1]) {
                    dCount++;
                }
            }
            if(s[s.length-1]=='U') uCount++; else dCount++;
            System.out.println(Math.min(uCount,dCount));
        }
    }
}