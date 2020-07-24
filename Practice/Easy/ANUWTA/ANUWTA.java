package Practice.Easy.ANUWTA;

/**
 * ANUWTA
 */
import java.io.*;

public class ANUWTA {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            long n = Long.parseLong(br.readLine());

            System.out.println(n * (n + 1) / 2 + n);
            ;
        }
    }
}