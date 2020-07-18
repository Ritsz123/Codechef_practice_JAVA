package Practice.Begineer.RECTSQ;

/**
 * RECTSQ
 */
import java.io.*;

// to find minimum number of squares be formed of same size
// find gcd of two sides then divide the both sides by gcd and multiply it
// i.e  (a/gcd) * (b/gcd)

class RECTSQ {

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a > b)
            return gcd(a % b, b);
        return gcd(a, b % a);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            int g = gcd(a, b);
            int ans = (a / g) * (b / g);
            System.out.println(ans);
        }
    }
}