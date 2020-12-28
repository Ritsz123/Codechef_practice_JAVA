package Practice.Easy.SWAP10HG;

/**
 * SWAP10HG
 */
import java.util.*;

class SWAP10HG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            char[] a = sc.next().toCharArray();
            char[] b = sc.next().toCharArray();
            int o = 0;
            int a0 = 0, a1 = 0, b0 = 0, b1 = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == '0') {
                    a0++;
                } else if (a[i] == '1') {
                    a1++;
                }
                if (b[i] == '0') {
                    b0++;
                } else if (b[i] == '1') {
                    b1++;
                }
            }
            boolean isPoss = true;
            if (a1 == b1 && a0 == b0) {
                for (int i = 0; i < n; i++) {
                    if (a[i] != b[i]) {
                        if (a[i] == '1') {
                            o++;
                        } else if (a[i] == '0' && o > 0) {
                            o--;
                        }
                    }
                }
            } else {
                isPoss = false;
            }

            if (o == 0 && isPoss) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}