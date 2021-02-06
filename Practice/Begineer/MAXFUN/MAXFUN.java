package Practice.Begineer.MAXFUN;

/**
 * MAXFUN
 */
import java.io.*;
import java.util.Arrays;

class MAXFUN {
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
            long x = arr[0];
            long y = arr[1];
            long z = arr[n - 1];
            long ans = Math.abs(x - y) + Math.abs(y - z) + Math.abs(z - x);
            System.out.println(ans);
        }
    }
}
