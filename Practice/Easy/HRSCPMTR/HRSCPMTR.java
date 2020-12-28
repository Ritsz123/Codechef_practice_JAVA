package Practice.Easy.HRSCPMTR;

/**
 * HRSCPMTR
 */
import java.util.*;

class HRSCPMTR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long[][] arr = new long[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextLong();
                }
            }
            int q = sc.nextInt();
            long[][] queries = new long[q][3];
            for (int i = 0; i < q; i++) {
                for (int j = 0; j < 3; j++) {
                    queries[i][j] = sc.nextLong();
                }
            }
            int count = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < m - 1; j++) {
                    if (arr[i][j] != arr[i + 1][j + 1]) {
                        count++;
                    }
                }
            }

            for (int i = 0; i < q; i++) {
                int x = (int) (queries[i][0] - 1);
                int y = (int) (queries[i][1] - 1);
                long oldValue = arr[x][y];
                arr[x][y] = queries[i][2];
                long newValue = queries[i][2];

                if (x > 0 && y > 0) {
                    long prev_diag = arr[x - 1][y - 1];
                    if (prev_diag == newValue && oldValue != newValue) {
                        count--;
                    }
                    if (prev_diag != newValue && oldValue == prev_diag) {
                        count++;
                    }
                } else if (x != arr.length - 1 && y != arr[0].length - 1) {
                    long next_diag = arr[x + 1][y + 1];
                    if (next_diag == newValue && oldValue != newValue) {
                        count--;
                    }
                    if (next_diag != newValue && oldValue == next_diag) {
                        count++;
                    }
                }

                if (count == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}