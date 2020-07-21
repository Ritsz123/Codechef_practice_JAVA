package Practice.Easy.LEPERMUT;

/**
 * LEPERMUT
 */
import java.io.*;

class LEPERMUT {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(line[i]);
            }
            int countM = 0;
            int countL = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] > arr[j]) {
                        countM++;
                    }
                }
            }
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    countL++;
                }
            }
            if (countM == countL) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}