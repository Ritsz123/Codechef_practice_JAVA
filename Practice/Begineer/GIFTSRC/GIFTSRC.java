package Practice.Begineer.GIFTSRC;

/**
 * GIFTSRC
 */
import java.io.*;

class GIFTSRC {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            char[] arr = br.readLine().toCharArray();
            int x = 0, y = 0;
            char p = arr[0], cc;
            if (p == 'L') {
                x--;
            } else if (p == 'R') {
                x++;
            } else if (p == 'U') {
                y++;
            } else if (p == 'D') {
                y--;
            }
            cc = p;
            for (int i = 1; i < n; i++) {
                p = arr[i];
                if (cc == 'U' || cc == 'D') {
                    if (p == 'L') {
                        x--;
                    } else if (p == 'R') {
                        x++;
                    }
                    cc = p;
                } else if (cc == 'L' || cc == 'R') {
                    if (p == 'U') {
                        y++;
                    } else if (p == 'D') {
                        y--;
                    }
                    cc = p;
                }
            }
            System.out.println(x + " " + y);
        }
    }
}