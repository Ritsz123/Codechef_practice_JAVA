package Practice.Begineer.GOODBAD;

/**
 * GOODBAD
 */

import java.io.*;

class GOODBAD {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            char[] arr = br.readLine().toCharArray();
            int upper = 0;
            int lower = 0;
            for (int i = 0; i < n; i++) {
                if (Character.isUpperCase(arr[i])) {
                    upper++;
                }
            }
            lower = n - upper;

            if (upper <= k && lower <= k) {
                System.out.println("both");
            } else if (upper <= k) {
                System.out.println("chef");
            } else if (lower <= k) {
                System.out.println("brother");
            } else
                System.out.println("none");
        }
    }
}