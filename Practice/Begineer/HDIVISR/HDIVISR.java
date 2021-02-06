package Practice.Begineer.HDIVISR;

/**
 * HDIVISR
 */
import java.io.*;

class HDIVISR {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 10; i > 0; i--) {
            if (n % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
