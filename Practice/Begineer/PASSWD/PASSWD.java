package Practice.Begineer.PASSWD;

/**
 * PASSWD
 */
import java.io.*;

class PASSWD {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            char[] arr = br.readLine().toCharArray();
            int a = 0, b = 0, c = 0, d = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 'a' && arr[i] <= 'z') {
                    a++;
                } else if (i > 0 && i < arr.length - 1 && arr[i] >= 'A' && arr[i] <= 'Z') {
                    b++;
                } else if (i > 0 && i < arr.length - 1 && Character.isDigit(arr[i])) {
                    c++;
                } else if (i > 0 && i < arr.length - 1
                        && (arr[i] == '@' || arr[i] == '#' || arr[i] == '%' || arr[i] == '&' || arr[i] == '?')) {
                    d++;
                }
            }
            if (arr.length >= 10 && a > 0 && b > 0 && c > 0 && d > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}