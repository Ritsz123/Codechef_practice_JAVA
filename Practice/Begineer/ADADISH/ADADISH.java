package Practice.Begineer.ADADISH;

/**
 * ADADISH
 */
import java.io.*;
import java.util.Arrays;

class ADADISH {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] line = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(line[i]);
            }
            Arrays.sort(arr);
            int b1 = 0, b2 = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (b1 < b2) {
                    b1 += arr[i];
                } else {
                    b2 += arr[i];
                }
            }
            int minTime = Math.max(b1, b2);
            System.out.println(minTime);
        }
    }
}