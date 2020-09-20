package Practice.Begineer.CHEFNWRK;

/**
 * CHEFNWRK
 */
import java.io.*;

class CHEFNWRK {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            int[] arr = new int[n];
            String[] line2 = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(line2[i]);
            }

            int count = 1;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > k) {
                    count = -1;
                    break;
                }
                if ((sum + arr[i]) <= k) {
                    sum += arr[i];
                } else {
                    count++;
                    sum = arr[i];
                }
            }
            System.out.println(count);
        }
    }
}