package Practice.Begineer.PPSUM;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class PPSUM {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] line = br.readLine().split(" ");
            int d = Integer.parseInt(line[0]);
            int n = Integer.parseInt(line[1]);
            int sum = 0;
            for (int i = 1; i <= d; i++) {
                sum = (n * (n + 1)) / 2;
                n = sum;
            }
            System.out.println(sum);
        }
    }
}