package Practice.Easy.RESQ;

/**
 * RESQ
 */
// as we need to find minimum difference hence we will use decrement loop
// to avoid TLE we will start with sqrt(num) as anyhow i after sqrt(num) will be repeated number so we will not consider it
import java.io.*;

public class RESQ {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            long num = Long.parseLong(br.readLine());
            long ans = 0;
            for (int i = (int) Math.sqrt(num); i >= 1; i--) {
                if (num % i == 0) {
                    long x = num / i;
                    ans = Math.abs(i - x);
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}