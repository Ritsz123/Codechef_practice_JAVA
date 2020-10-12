package Practice.Begineer.CHEFEZQ;

/**
 * CHEFEZQ
 */
import java.io.*;

class CHEFEZQ {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            long[] arr = new long[n];
            String[] line2 = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(line2[i]);
            }
            long total = 0;
            long day = 0;
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                total += arr[i];
                total -= k;
                day++;
                if (total < 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                day += (total / k) + 1;
            }
            System.out.println(day);
        }
    }
}