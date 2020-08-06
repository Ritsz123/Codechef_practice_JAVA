package Practice.Begineer.QUALPREL;

/**
 * QUALPREL
 */

import java.io.*;
import java.util.*;

class QUALPREL {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n, k;
            String[] line = br.readLine().split(" ");
            n = Integer.parseInt(line[0]);
            k = Integer.parseInt(line[1]);
            String[] line2 = br.readLine().split(" ");
            ArrayList<Long> al = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                al.add(Long.parseLong(line2[i]));
            }
            al.sort(Collections.reverseOrder());
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (al.get(i) >= al.get(k - 1)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
