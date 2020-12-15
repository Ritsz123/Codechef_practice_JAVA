package Practice.Begineer.SPLITIT;

/**
 * SPLITIT
 */
import java.io.*;

class SPLITIT {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            boolean poss = false;
            for (int i = 0; i < n; i++) {
                if (str.substring(0, i).contains(str.substring(i, n))) {
                    poss = true;
                    break;
                }
            }
            if (poss) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}