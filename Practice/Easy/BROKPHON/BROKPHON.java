package Practice.Easy.BROKPHON;

/**
 * BROKPHON
 */
import java.io.*;

public class BROKPHON {

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

            int c = 0;
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    if (arr[i] != arr[i + 1]) {
                        c++;
                    }
                } else if (i == n - 1) {
                    if (arr[i] != arr[i - 1])
                        c++;
                } else {
                    if (arr[i] != arr[i - 1] || arr[i] != arr[i + 1]) {
                        c++;
                    }
                }
            }

            System.out.println(c);
        }
    }
}