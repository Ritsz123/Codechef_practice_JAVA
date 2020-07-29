package Practice.Begineer.PRGIFT;

/**
 * PRGIFT
 */
import java.io.*;

class PRGIFT {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            String[] line2 = br.readLine().split(" ");
            int count = 0;
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(line2[i]);
                if (num % 2 == 0) {
                    count++;
                }
            }
            if (count >= k) {
                if (count == n && k == 0)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}