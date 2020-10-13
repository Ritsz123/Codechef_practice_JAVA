package Practice.Begineer.CHEFRUN;

/**
 * CHEFRUN
 */
import java.util.*;

class CHEFRUN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int x1, x2, x3, v1, v2;
            x1 = sc.nextInt();
            x2 = sc.nextInt();
            x3 = sc.nextInt();
            v1 = sc.nextInt();
            v2 = sc.nextInt();
            int d1 = Math.abs(x3 - x1);
            int d2 = Math.abs(x3 - x2);
            float t1 = d1 / (float) v1;
            float t2 = d2 / (float) v2;
            if (t1 < t2) {
                System.out.println("Chef");
            } else if (t2 < t1) {
                System.out.println("Kefa");
            } else {
                System.out.println("Draw");
            }
        }
        sc.close();
    }
}