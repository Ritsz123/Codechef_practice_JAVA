package Practice.Easy.ANUARM;

/**
 * ANUARM
 */
import java.io.*;

public class ANUARM {

    static void calcfront(int[] arr, int c) {
        int num = 0;
        for (int j = c; j < arr.length; j++) {
            arr[j] = Math.max(arr[j], num);
            num++;
        }
    }

    static void calcBack(int[] arr, int c) {
        int num = 0;
        for (int j = c; j >= 0; j--) {
            arr[j] = Math.max(arr[j], num++);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);
            int[] arr = new int[n];
            String[] line2 = br.readLine().split(" ");
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                int c = Integer.parseInt(line2[i]);
                if (c < min)
                    min = c;
                if (c > max)
                    max = c;
            }
            calcfront(arr, min);
            calcBack(arr, max);
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

}