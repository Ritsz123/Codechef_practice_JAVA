package Practice.Begineer.SUMPOS;

/**
 * SUMPOS
 */
import java.io.*;
import java.util.Arrays;

class SUMPOS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(line[i]);
            }
            Arrays.sort(arr);
            if (arr[2] - arr[1] == arr[0]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
