package Practice.Easy.ZUBREACH;

/**
 * ZUBREACH
 */
import java.io.*;

public class ZUBREACH {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int q = 0;
        while (t-- != 0) {
            q++;
            String[] safe = br.readLine().split(" ");
            int m = Integer.parseInt(safe[0]);
            int n = Integer.parseInt(safe[1]);
            String[] dest = br.readLine().split(" ");
            int rx = Integer.parseInt(dest[0]);
            int ry = Integer.parseInt(dest[1]);
            int len = Integer.parseInt(br.readLine());
            char[] seq = br.readLine().toCharArray();
            int x, y;
            x = y = 0;
            for (int i = 0; i < len; i++) {
                char ch = seq[i];
                if (ch == 'L') {
                    x--;
                } else if (ch == 'R') {
                    x++;
                } else if (ch == 'U') {
                    y++;
                } else if (ch == 'D') {
                    y--;
                }
            }
            if (x == rx && y == ry) {
                System.out.println("Case " + q + ": REACHED");
            } else if (x < 0 || y < 0 || x >= m && y >= n) {
                System.out.println("Case " + q + ": DANGER");
            } else {
                System.out.println("Case " + q + ": SOMEWHERE");
            }
        }
    }
}