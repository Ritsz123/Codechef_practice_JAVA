package Practice.Begineer.MSNSADM1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * MSNSADM1
 */
public class MSNSADM1 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] a = br.readLine().split(" ");
            String[] b = br.readLine().split(" ");
            int maxScore=0;
            for (int i = 0; i < n; i++) {
                int score = (Integer.parseInt(a[i]) * 20) - (Integer.parseInt(b[i]) * 10);
                if (score>maxScore) {
                    maxScore=score;
                }
            }
            if(maxScore<0){
                System.out.println("0");
            }else System.out.println(maxScore);

        }
    }
}