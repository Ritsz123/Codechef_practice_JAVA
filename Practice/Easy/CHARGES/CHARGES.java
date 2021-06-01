package Practice.Easy.CHARGES;

import java.io.*;

class CHARGES {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            char[] arr = br.readLine().toCharArray();
            line = br.readLine().split(" ");
            int[] brr = new int[k];
            for (int i = 0; i < k; i++) {
                brr[i] = Integer.parseInt(line[i]) - 1;
            }

            int diff = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] == arr[i]) {
                    diff += 2;
                } else {
                    diff += 1;
                }
            }

            for (int i = 0; i < k; i++) {
                int j = brr[i];
                if (arr[j] == '1') {
                    arr[j] = '0';
                } else {
                    arr[j] = '1';
                }

                if (j > 0) {
                    if (arr[j - 1] == arr[j]) {
                        diff++;
                    } else
                        diff--;
                }

                if (j < n - 1) {
                    if (arr[j + 1] == arr[j]) {
                        diff++;
                    } else
                        diff--;
                }
                System.out.println(diff);
            }
        }
    }
}
