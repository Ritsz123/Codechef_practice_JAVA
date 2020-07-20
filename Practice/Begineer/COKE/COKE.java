package Practice.Begineer.COKE;

import java.io.*;

class COKE {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);
            int k = Integer.parseInt(line[2]);
            int l = Integer.parseInt(line[3]);
            int r = Integer.parseInt(line[4]);
            int[] c = new int[n];
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                String[] line2 = br.readLine().split(" ");
                c[i] = Integer.parseInt(line2[0]);
                p[i] = Integer.parseInt(line2[1]);
            }

            for (int i = 0; i < n; i++) {

                if (c[i] >= k - 1 && c[i] <= k + 1) {
                    c[i] = k;
                } else if (c[i] > k + 1) {
                    c[i] = Math.max(c[i] - m, k); // to make decission to choose or to not
                } else if (c[i] < k - 1) {
                    c[i] = Math.min(c[i] + m, k); // to make decission to choose or to not
                }

            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (c[i] >= l && c[i] <= r) {
                    if (p[i] < min) {
                        min = p[i];
                    }
                }
            }

            if (min < Integer.MAX_VALUE)
                System.out.println(min);
            else
                System.out.println("-1");
        }
    }
}