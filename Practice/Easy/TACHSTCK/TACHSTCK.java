package Practice.Easy.TACHSTCK;

/**
 * TACHSTCK
 */
import java.io.*;
import java.util.Arrays;

public class TACHSTCK {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        long d = Long.parseLong(line[1]);
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(arr);
        int coutn = 0;
        for (int i = 0; i < n - 1; i++) {
            if ((arr[i + 1] - arr[i]) <= d) {
                coutn++;
                i++;
            }
        }
        System.out.println(coutn);
    }
}