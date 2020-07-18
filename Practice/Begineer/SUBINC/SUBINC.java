package Practice.Begineer.SUBINC;

/**
 * SUBINC
 */
import java.io.*;

public class SUBINC {

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
            int count = 0;
            for (int i = 0; i < n; i++) {
                long prev = arr[i];
                for (int j = i; j < n; j++) {
                    if (prev <= arr[j]) {
                        if (arr[i] <= arr[j]) {
                            count++;
                        }
                        prev = arr[j];
                    } else
                        break;
                }
            }
            System.out.println(count);
        }
    }
}