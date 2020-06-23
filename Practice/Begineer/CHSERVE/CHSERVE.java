package Practice.Begineer.CHSERVE;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * CHSERVE
 */
public class CHSERVE {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] line = br.readLine().split(" ");
            int p1 = Integer.parseInt(line[0]);
            int p2 = Integer.parseInt(line[1]);
            int k = Integer.parseInt(line[2]);

            if (((p1+p2)%k*2)<k) {
                System.out.println("CHEF");
            }else System.out.println("COOK");
        }
    }
}