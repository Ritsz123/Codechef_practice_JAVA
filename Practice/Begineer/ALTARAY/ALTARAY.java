package Practice.Begineer.ALTARAY;

/**
 * ALTARAY
 */
import java.io.*;
import java.util.*;

class ALTARAY {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(line[i]);
            }
            int[] ans = new int[n];
            int count = 1;
            Arrays.fill(ans, 1);
            for (int i = n - 1; i > 0; i--) {
                if ((arr[i] > 0 && arr[i - 1] < 0) || (arr[i] < 0 && arr[i - 1] > 0)) {
                    count++;
                    ans[i - 1] = count;
                } else
                    count = 1;
            }
            StringBuilder sb = new StringBuilder();
            for (int x : ans) {
                sb.append(x + " ");
            }
            System.out.println(sb.toString());
        }
    }
}