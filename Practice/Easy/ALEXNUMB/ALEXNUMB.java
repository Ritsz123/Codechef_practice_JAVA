package Practice.Easy.ALEXNUMB;

/**
 * ALEXNUMB
 */
// the a[i]'s doesnt matter we simply need n
// another simple maths simply do [n * (n-1)/2]
import java.io.*;

public class ALEXNUMB {

    static long sum(long n) {
        long sumValue = 0;
        if (n <= 0)
            return 0;
        sumValue = n + sum(n - 1);
        return sumValue;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            System.out.println(sum(n - 1));
        }
    }
}