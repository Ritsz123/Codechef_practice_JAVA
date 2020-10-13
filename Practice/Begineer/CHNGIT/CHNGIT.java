package Practice.Begineer.CHNGIT;

/**
 * CHNGIT
 */
import java.io.*;

class CHNGIT {

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
            int[] counts = new int[101];
            for (int i = 0; i < n; i++) {
                counts[arr[i]]++;
            }
            int max = 0;
            int maxNum = 0;
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] > max) {
                    max = counts[i];
                    maxNum = i;
                }
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] != maxNum) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}