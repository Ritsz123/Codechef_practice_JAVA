package Practice.Easy.CSUB;

/**
 * CSUB
 */
// count number of 1's present 
// and answer is (count * (count+1))/2
import java.io.*;

public class CSUB {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            char[] arr = br.readLine().toCharArray();
            long count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == '1') {
                    count++;
                }
            }
            System.out.println((count * (count + 1)) / 2);
        }
    }
}