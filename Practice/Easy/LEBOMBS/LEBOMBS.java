package Practice.Easy.LEBOMBS;

import java.io.*;

class LEBOMBS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            char[] arr = br.readLine().toCharArray();
            if (n > 1) {
                for (int i = 0; i < n; i++) {
                    if (arr[i] == '1') {
                        if (i == 0) {
                            if (arr[i + 1] == '0') {
                                arr[i + 1] = '#';
                            }
                        } else if (i == n - 1) {
                            arr[i - 1] = '#';
                        } else {
                            if (arr[i] == '1') {
                                arr[i - 1] = '#';
                                if (arr[i + 1] == '0') {
                                    arr[i + 1] = '#';
                                }
                            }
                        }
                    }
                }
            }

            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == '0') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
