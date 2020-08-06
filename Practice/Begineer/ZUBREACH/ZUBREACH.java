package Practice.Begineer.ZUBREACH;

/**
 * ZUBREACH
 */
import java.io.*;

class ZUBREACH {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int c = 0;
        while (t-- != 0) {
            c++;
            int m, n, rx, ry, len;
            int x = 0;
            int y = 0;
            String[] line = br.readLine().split(" ");
            m = Integer.parseInt(line[0]);
            n = Integer.parseInt(line[1]);
            String[] line2 = br.readLine().split(" ");
            rx = Integer.parseInt(line2[0]);
            ry = Integer.parseInt(line2[1]);
            len = Integer.parseInt(br.readLine());
            char[] arr = new char[len];
            arr = br.readLine().toCharArray();
            for (int i = 0; i < len; i++) {
                char ch = arr[i];
                switch (ch) {
                    case 'U':
                        y++;
                        break;
                    case 'D':
                        y--;
                        break;
                    case 'L':
                        x--;
                        break;
                    case 'R':
                        x++;
                        break;
                }
            }
            String ans = "";
            if (x == rx && y == ry) {
                ans = "REACHED";
            } else if (x < 0 || x > m || y < 0 || y > n) {
                ans = "DANGER";
            } else {
                ans = "SOMEWHERE";
            }
            System.out.println("Case " + c + ": " + ans);
        }
    }
}
