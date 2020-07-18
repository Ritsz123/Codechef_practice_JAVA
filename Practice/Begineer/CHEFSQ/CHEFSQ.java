package Practice.Begineer.CHEFSQ;

/**
 * CHEFSQ
 */
import java.io.*;

public class CHEFSQ {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            long[] arr1 = new long[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = Long.parseLong(line[i]);
            }
            int m = Integer.parseInt(br.readLine());
            String[] line2 = br.readLine().split(" ");
            long[] arr2 = new long[m];
            for (int i = 0; i < m; i++) {
                arr2[i] = Long.parseLong(line2[i]);
            }

            boolean isPossible = true;
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (arr1[i] == arr2[j]) {
                    j++;
                }
                if (j == m)
                    break;
            }
            if (j < m) {
                isPossible = false;
            }
            if (isPossible) {
                System.out.println("Yes");
            } else
                System.out.println("No");
        }
    }
}