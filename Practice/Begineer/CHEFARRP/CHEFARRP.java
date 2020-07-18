package Practice.Begineer.CHEFARRP;

/**
 * CHEFA
 * RRP
 */
import java.io.*;

class CHEFARRP {

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
                long sum = 0;
                long mul = 1;
                for (int j = i; j < n; j++) {
                    sum += arr[j];
                    mul *= arr[j];

                    if (sum == mul) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}