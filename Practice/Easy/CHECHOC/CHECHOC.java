package Practice.Easy.CHECHOC;

/**
 * CHECHOC
 */
import java.util.*;

class Chechoc {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            long ans = 0;
            if (n * m == 1) {
                ans = x;
            } else {
                x = Math.min(x, y);
                y = Math.min(2 * x, y);
                long mx = n * m;
                if (mx % 2 == 1) {
                    ans = (mx / 2) * y + x;
                } else if (mx % 2 == 0) {
                    ans = (mx / 2) * y;
                }
            }
            System.out.println(ans);
        }

    }

}
