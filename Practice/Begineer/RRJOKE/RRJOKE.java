package Practice.Begineer.RRJOKE;

/**
 * RRJOKE
 */

//  this problem is totally a joke..!
// this taught me you should always look once for the given output section of the problm.
// there is no use of the inputs except n;
// answer is xor of elements from 1 to n
import java.io.*;

public class RRJOKE {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                String line = br.readLine();
            }
            int ans = 1;
            for (int i = 2; i <= n; i++) {
                ans = ans ^ i;
            }
            System.out.println(ans);
        }
    }
}