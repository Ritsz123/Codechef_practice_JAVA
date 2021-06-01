package Practice.Begineer.TWINGFT;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

class TWINGFT {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);

            Long[] arr = new Long[n];
            line = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(line[i]);
            }

            Arrays.sort(arr, Collections.reverseOrder());
            long a = 0, b = 0;

            for (int i = 0; i < 2 * k; i += 2) {
                a += arr[i];
            }

            for (int i = 1; i < 2 * k; i += 2) {
                b += arr[i];
            }

            b += arr[2 * k];

            long ans;
            if (a >= b) {
                ans = a;
            } else {
                ans = b;
            }

            System.out.println(ans);
        }
    }
}
