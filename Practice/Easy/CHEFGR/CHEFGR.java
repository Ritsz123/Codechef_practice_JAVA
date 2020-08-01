package Practice.Easy.CHEFGR;

/**
 * CHEFGR
 */
import java.io.*;

public class CHEFGR {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);
            int[] arr = new int[n];
            String[] line2 = br.readLine().split(" ");
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(line2[i]);
                arr[i] = num;
                if (num > max)
                    max = num;
            }
            for (int i = 0; i < n; i++) {
                sum = sum + (max - arr[0]);
            }
            if (sum > m)
                System.out.println("No");
            else if ((m - sum) % n == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}