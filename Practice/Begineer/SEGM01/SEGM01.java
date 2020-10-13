package Practice.Begineer.SEGM01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * SEGM01
 */
class SEGM01 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            char[] arr = br.readLine().toCharArray();
            int start = arr.length, end = -1;
            boolean poss = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '1') {
                    start = Math.min(start, i);
                    end = Math.max(end, i);
                }
            }
            if (end == -1) {
                poss = false;
            }
            for (int i = start; i <= end; i++) {
                if (arr[i] != '1') {
                    poss = false;
                    break;
                }
            }
            if (poss) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}