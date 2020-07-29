package Practice.Begineer.PERMUT2;

/**
 * PERMUT2
 */
import java.io.*;

class PERMUT2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0)
                break;
            int[] arr = new int[n];
            int[] per = new int[n];
            String[] line = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(line[i]);
            }
            for (int i = 0; i < n; i++) {
                per[arr[i] - 1] = i + 1;
            }
            boolean isPossible = true;
            for (int i = 0; i < n; i++) {
                if (arr[i] != per[i]) {
                    isPossible = false;
                    break;
                }
            }
            if (isPossible)
                System.out.println("ambiguous");
            else
                System.out.println("not ambiguous");
        }

    }
}