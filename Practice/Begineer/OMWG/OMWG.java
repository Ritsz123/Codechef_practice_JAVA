package Practice.Begineer.OMWG;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * OMWG
 */
class CHEFEZQ {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);
            System.out.println(count(m, n));
        }
    }

    static int count(int m, int n) {
        boolean[][] arr = new boolean[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {

                } else {
                    if (j != 0) {
                        if (arr[i][j - 1]) {
                            count++;
                        }
                    }

                    if (i != 0) {
                        if (arr[i - 1][j]) {
                            count++;
                        }
                    }
                }
                arr[i][j] = true;
            }
        }
        return count;
    }
}