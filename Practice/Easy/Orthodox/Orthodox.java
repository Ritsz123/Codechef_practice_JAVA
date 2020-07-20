package Practice.Easy.Orthodox;

import java.io.*;
import java.util.*;;

class Orthodox {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(line[i]);
            }
            boolean isPossible = true;
            HashSet<Long> hs = new HashSet<>();
            for (int i = 0; i < n; i++) {
                long num = 0;
                for (int j = i; j < n; j++) {
                    num = num | arr[j];
                }
                if (!hs.add(num)) {
                    isPossible = false;
                    break;
                }
            }
            if (isPossible)
                System.out.println("YES");
            else
                System.out.println("NO");

        }

    }

}
