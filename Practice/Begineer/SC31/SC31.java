package Practice.Begineer.SC31;

/**
 * SC31
 */

//use xor technique
import java.io.*;

class SC31 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = br.readLine();
            }
            StringBuilder sb;
            char[] ans = "0000000000".toCharArray();
            for (int i = 0; i < n; i++) {
                sb = new StringBuilder();
                for (int j = 0; j < arr[i].length(); j++) {
                    char c1 = arr[i].charAt(j);
                    char c2 = ans[j];
                    sb.append(Integer.parseInt(Character.toString(c1)) ^ Integer.parseInt(Character.toString(c2)));
                }
                ans = sb.toString().toCharArray();
            }
            int count = 0;
            for (int i = 0; i < ans.length; i++) {
                if (ans[i] == '1')
                    count++;
            }
            System.out.println(count);
        }
    }
}