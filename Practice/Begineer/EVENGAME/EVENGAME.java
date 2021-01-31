package Practice.Begineer.EVENGAME;

/**
 * EVENGAME
 */
import java.io.*;

class EVENGAME {
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
            int odd = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 1) {
                    odd++;
                }
            }
            if (odd % 2 == 1) {
                System.out.println("2");
            } else {
                System.out.println("1");
            }
        }
    }
}