package Practice.Begineer.EVENDIFF;

/**
 * EVENDIFF
 */
import java.io.*;

class EVENDIF {
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
            int even = 0, odd = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 1) {
                    odd++;
                } else {
                    even++;
                }
            }
            System.out.println(Math.min(even, odd));
        }
    }
}