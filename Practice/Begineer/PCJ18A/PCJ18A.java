package Practice.Begineer.PCJ18A;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * PCJ18A
 */
class PCJ18A {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] line = br.readLine().split(" ");
            int inc = Integer.parseInt(line[1]);
            String[] line1 = br.readLine().split(" ");
            boolean liked = false;
            for (int i = 0; i < line1.length; i++) {
                if (Integer.parseInt(line1[i])>=inc) {
                    liked = true;
                    break;
                }
            }
            if (liked) {
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}