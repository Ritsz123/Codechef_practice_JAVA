package Practice.Begineer.LCH15JAB;

/**
 * LCH15JAB
 */
import java.io.*;

// Count the maximum number of occurences of each character 
// check if occurences of sum of all the other characters is equal to max

class LCH15JAB {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            char[] arr = br.readLine().toCharArray();
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (count > max)
                    max = count;
            }
            if (arr.length - max == max) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}