
package Practice.Easy.MVALUE;

import java.io.*;
import java.util.Arrays;

class MVALUE {

    static long ans(long a, long b) {
        return (a * b) + a - b;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            long[] arr = new long[n];
            String[] line = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(line[i]);
            }
            Arrays.sort(arr);

            long a = ans(arr[1], arr[0]);
            long b = ans(arr[n - 1], arr[n - 2]);
            long c = ans(arr[n - 1], arr[0]);

            long sum = Math.max(a, Math.max(b, c));
            System.out.println(sum);
        }
    }
}
