package Practice.Begineer.VACCINE1;

import java.util.*;

class VACCINE1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int d1, v1, d2, v2, p;
        d1 = sc.nextInt();
        v1 = sc.nextInt();
        d2 = sc.nextInt();
        v2 = sc.nextInt();
        p = sc.nextInt();
        int total = 0, c = 0;
        while (total < p) {
            c++;
            if (d1 <= c) {
                total += v1;
            }
            if (d2 <= c) {
                total += v2;
            }

        }
        System.out.println(c);
    }
}
