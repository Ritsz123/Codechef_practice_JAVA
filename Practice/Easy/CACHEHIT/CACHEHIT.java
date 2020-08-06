package Practice.Easy.CACHEHIT;

/**
 * CACHEHIT
 */
import java.io.*;

public class CACHEHIT {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            int m = Integer.parseInt(line[2]);
            String[] line2 = br.readLine().split(" ");
            int[] arr = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = Integer.parseInt(line2[i]);
            }
            int cache = -1;
            int count = 0;

            for (int i = 0; i < m; i++) {
                if (cache == -1) {
                    count++;
                    cache = arr[i] / b;
                } else {
                    if (arr[i] / b != cache) {
                        count++;
                        cache = arr[i] / b;
                    }
                }
            }
            System.out.println(count);
        }
    }
}