package Practice.Begineer.CK87MEDI;

import java.io.*;
import java.util.Arrays;
class TEMPLELA {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] line= br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            String[] line2 = br.readLine().split(" ");
            int [] nos = new int[n];
            for (int i = 0; i < n; i++) {
                nos[i]= Integer.parseInt(line2[i]);
            }
            Arrays.sort(nos);
            int median = (n+k)/2;
            System.out.println(nos[median]);
        }
    }
}