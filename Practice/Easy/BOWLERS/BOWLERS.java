package Practice.Easy.BOWLERS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * BOWLERS
 */
class COVID19B {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            int l = Integer.parseInt(line[2]);
            StringBuilder sb = new StringBuilder();
            int[] ans = new int[n];
            Arrays.fill(ans, 1);
            if ((k * l) >= n) {
                int x = 0;
                for (int i = 0; i <= n / k; i++) {
                    for (int j = 0; j < k && x < n; j++) {
                        ans[x++] = j + 1;
                    }
                }
                for (int i = 0; i < n % k && x < n; i++) {
                    ans[x++] = i + 1;
                }
                boolean isPoss = true;
                for (int i = 0; i < n - 1; i++) {
                    if (ans[i] == ans[i + 1]) {
                        isPoss = false;
                        break;
                    }
                }
                if (isPoss) {
                    for (int i = 0; i < n; i++) {
                        sb.append(ans[i] + " ");
                    }
                    System.out.println(sb.toString());
                } else {
                    System.out.println("-1");
                }
            } else {
                System.out.println("-1");
            }
        }
    }
}