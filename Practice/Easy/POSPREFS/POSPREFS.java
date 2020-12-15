package Practice.Easy.POSPREFS;

import java.util.Scanner;

/**
 * POSPREFS
 */
class POSPREFS {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            StringBuilder sb = new StringBuilder();

            ;
            int flag = 0;
            for (int i = 1; i <= n; i++) {
                arr[i - 1] = 0 - i;
            }
            arr[0] = Math.abs(arr[0]);
            k--;
            for (int i = 1; i < n; i++) {
                if (k >= n - i) {
                    arr[i] = Math.abs(arr[i]);
                    k--;
                } else if (flag == 0 && k != 0) {
                    arr[i] = Math.abs(arr[i]);
                    k--;
                    flag = 1;
                } else {
                    flag = 0;
                }

            }
            for (int j = 0; j < n; j++) {
                sb.append(arr[j] + " ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}