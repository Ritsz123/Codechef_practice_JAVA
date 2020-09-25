package Practice.Begineer.RNDPAIR;

/**
 * RNDPAIR
 */
import java.io.*;
import java.util.Arrays;

class RNDPAIR {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] line = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(line[i]);
            }
            Arrays.sort(arr);
            int count = 0;
            int total = (n * (n - 1)) / 2;
            int max = arr[n - 1] + arr[n - 2];
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] + arr[i] == max) {
                        count++;
                    }
                }
            }
            System.out.println((double) count / total);
        }
    }
}