package Practice.Easy.RRECIPE;

/**
 * RRECIPE
 */
import java.io.*;

class RRECIPE {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            char[] arr = br.readLine().toCharArray();
            int n = arr.length;
            int m = (n + 1) / 2;
            long count = 1;
            for (int i = 0; i < m; i++) {
                if (arr[i] == arr[n - 1 - i] && arr[i] == '?') {
                    count = count * 26;
                    count = count % 10000009;
                } else if (arr[i] != arr[n - 1 - i] && arr[i] != '?' && arr[n - 1 - i] != '?') {
                    count = 0;
                    break;
                }
            }
            System.out.println(count);
        }
    }
}