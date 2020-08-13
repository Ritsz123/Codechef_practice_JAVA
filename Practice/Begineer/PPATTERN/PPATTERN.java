package Practice.Begineer.PPATTERN;

/**
 * PPATTERN
 */
import java.util.*;

class PPATTERN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] p = new int[(n - 1) * 2];
            for (int i = 0; i < n - 1; i++) {
                p[i] = i + 1;
            }
            int num = n - 1;
            for (int i = n - 1; i < (n - 1) * 2; i++) {
                p[i] = num;
                num--;
            }
            int point = 0;
            int[][] ans = new int[n][n];
            for (int i = 0; i < n; i++) {
                int temp = point;
                for (int j = 0; j < n; j++) {
                    if (i == 0 && j == 0) {
                        ans[i][j] = 1;
                    } else if (j == 0) {
                        ans[i][j] = ans[i - 1][j] + i + 1;
                    } else {
                        ans[i][j] = ans[i][j - 1] + p[temp];
                        temp++;
                    }
                }
                point++;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
