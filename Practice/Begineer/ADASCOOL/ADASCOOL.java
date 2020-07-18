package Practice.Begineer.ADASCOOL;

/**
 * ADASCOOL
 */

//  shuffling of the benches will always be possible if atleast 1 amoung rows or columns is even

import java.io.*;

public class ADASCOOL {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);

            if (a % 2 == 0 || b % 2 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}