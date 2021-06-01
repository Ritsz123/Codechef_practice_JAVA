package Practice.Begineer.TANDJ1;

/**
 * TANDJ1
 */
import java.io.*;

class TANDJ1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            int c = Integer.parseInt(line[2]);
            int d = Integer.parseInt(line[3]);
            int k = Integer.parseInt(line[4]);

            int ad = Math.abs(a - c);
            int bd = Math.abs(b - d);

            int s = ad + bd;
            boolean poss = false;
            if (s % 2 == 0) {
                if (k % 2 == 0 && k >= s) {
                    poss = true;
                }
            } else {
                if (k % 2 == 1 && k >= s) {
                    poss = true;
                }
            }
            System.out.println(poss ? "YES" : "NO");
        }
    }
}
