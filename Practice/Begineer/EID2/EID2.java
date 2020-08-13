package Practice.Begineer.EID2;

import java.io.*;

/**
 * EID2
 */
class EID2 {
    static int check(int a, int b) {
        if (a == b)
            return 0;
        if (a > b)
            return -1;
        return 1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int[] age = new int[3];
            int[] cost = new int[3];
            for (int i = 0; i < 3; i++) {
                age[i] = Integer.parseInt(line[i]);
            }
            for (int i = 3; i < 6; i++) {
                cost[i - 3] = Integer.parseInt(line[i]);
            }
            boolean isPoss = false;

            if (check(age[0], age[1]) == check(cost[0], cost[1]) && check(age[1], age[2]) == check(cost[1], cost[2])
                    && check(age[0], age[3]) == check(cost[0], cost[3])) {
                isPoss = true;
            }
            if (isPoss) {
                System.out.println("FAIR");
            } else
                System.out.println("NOT FAIR");
        }
    }
}