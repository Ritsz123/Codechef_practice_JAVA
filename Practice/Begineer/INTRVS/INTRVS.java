package Practice.Begineer.INTRVS;

import java.io.*;

class INTRVS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            int[] arr = new int[n];
            line = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(line[i]);
            }
            int solved = 0;
            boolean isSlow = false;
            int oneSec = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] != -1) {
                    solved++;
                    if (arr[i] <= 1) {
                        oneSec++;
                    }
                    if (arr[i] > k) {
                        isSlow = true;
                    }
                }
            }
            if (solved >= (n + 1) / 2) {
                if (isSlow) {
                    System.out.println("Too Slow");
                } else {
                    if (oneSec == n) {
                        System.out.println("Bot");
                    } else {
                        System.out.println("Accepted");
                    }
                }
            } else {
                System.out.println("Rejected");
            }
        }
    }
}