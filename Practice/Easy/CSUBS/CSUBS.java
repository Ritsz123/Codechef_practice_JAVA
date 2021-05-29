package Practice.Easy.CSUBS;

/**
 * CSUBS
 */
import java.io.*;
import java.util.*;

class CSUBS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            int[] arr = new int[n];
            line = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(line[i]);
            }

            int ans = 0;
            for (int i = 1; i <= k; i++) {

                int j = i - 1;
                Map<Integer, Integer> mp = new HashMap<>();
                int count = 0;
                while (j < n) {
                    mp.put(arr[j], mp.getOrDefault(arr[j], 0) + 1);
                    j += k;
                    count++;
                }

                int maxFreq = 0;
                for (Map.Entry<Integer, Integer> e : mp.entrySet()) {
                    if (e.getValue() > maxFreq) {
                        maxFreq = e.getValue();
                    }
                }
                ans += (count - maxFreq);
            }
            System.out.println(ans);
        }
    }
}