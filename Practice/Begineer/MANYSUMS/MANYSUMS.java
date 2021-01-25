package Practice.Begineer.MANYSUMS;

/**
 * MANYSUMS
 */
import java.io.*;

public class MANYSUMS {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            int ans = ((b - a) * 2) + 1;
            System.out.println(ans);
        }
    }
}