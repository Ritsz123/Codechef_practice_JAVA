package Practice.Begineer.LCOLLIS;

/**
 * LCOLLIS
 */
import java.io.*;

class LCOLLIS {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);
            char[][] arr = new char[n][m];
            for (int i = 0; i < n; i++) {
                arr[i] = br.readLine().toCharArray();
            }
            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (arr[j][i] == '1' && arr[k][i] == '1')
                            count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}