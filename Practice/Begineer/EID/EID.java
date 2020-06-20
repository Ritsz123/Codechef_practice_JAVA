package Practice.Begineer.EID;

import java.io.*;
import java.util.Arrays;
/**
 * EID
 */
public class EID {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int [] coins = new int[n];
            for (int i = 0; i < n; i++) {
                coins[i] =Integer.parseInt(line[i]);
            }
            Arrays.sort(coins);
            int minDiff = Integer.MAX_VALUE;
            for (int i = 0; i < coins.length-1; i++) {
                int diff = coins[i+1]-coins[i];
                if (diff<minDiff) {
                    minDiff=diff;
                }
            }
            System.out.println(minDiff);
        }
    }
}