package Practice.Begineer.EXUNA;

/**
 * EXUNA
 */
import java.io.*;
import java.util.Arrays;

class EXUNA {

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
            long ans = arr[0];
            Arrays.sort(arr);
            for (int i = 1; i < n; i++) {
                ans = ans % arr[i];
            }
            System.out.println(ans);
        }
    }
}