package Practice.Begineer.GOODSET;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * GOODSET
 */
class GOODSET {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            int [] ar= new int[n];
            ar[0]=1;
            for (int i = 1; i < n; i++) {
                ar[i] = ar[i-1]+2;
            }
            for (int i = 0; i < ar.length; i++) {
                System.out.print(ar[i] + " ");
            }
            System.out.println();
        }
    }
}