package Practice.Begineer.COUPON2;

/**
 * COUPON2
 */
import java.io.*;

class COUPON2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int delivery = Integer.parseInt(line[0]);
            int coupon = Integer.parseInt(line[1]);
            int[][] arr = new int[2][3];
            for (int i = 0; i < arr.length; i++) {
                line = br.readLine().split(" ");
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = Integer.parseInt(line[j]);
                }
            }
            // without coupon
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                int daySum = 0;
                for (int j = 0; j < arr[0].length; j++) {
                    daySum += arr[i][j];
                }
                daySum += delivery;
                sum += daySum;
            }
            int sum2 = 0;
            for (int i = 0; i < arr.length; i++) {
                int daySum = 0;
                for (int j = 0; j < arr[0].length; j++) {
                    daySum += arr[i][j];
                }
                if (daySum < 150) {
                    daySum += delivery;
                }
                sum2 += daySum;
            }
            sum2 += coupon;
            if (sum2 < sum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
