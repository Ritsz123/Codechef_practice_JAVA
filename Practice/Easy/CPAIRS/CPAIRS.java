package Practice.Easy.CPAIRS;

/**
 * CPAIRS
 */
import java.io.*;

class CPAIRS {

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
            int count = 0;
            count = solve(arr, n);
            System.out.println(count);
        }
    }

    static int solve(long[] arr, int n) {
        int odd = 0;
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                count += odd;
            } else {
                odd++;
            }
        }
        return count;
    }

}