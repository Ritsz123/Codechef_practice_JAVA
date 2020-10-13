package Practice.Begineer.PERFCONT;

/**
 * PERFCONT
 */
import java.io.*;

class PERFCONT {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int p = Integer.parseInt(line[1]);
            int[] arr = new int[n];
            String[] line2 = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(line2[i]);
            }
            int easy = 0, hard = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] >= p / 2) {
                    easy++;
                } else if (arr[i] <= p / 10) {
                    hard++;
                }
            }

            if (easy == 1 && hard == 2) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}