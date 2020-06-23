package Practice.Begineer.PROC18A;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * PROC18A
 */
public class PROC18A {

    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            String[] line2 = br.readLine().split(" ");
            int maxsum=0;
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=Integer.parseInt(line2[i]);
            }
            for (int i = 0; i < line2.length-k; i++) {
                int tmp=0;
                for (int j = i; j < i+k; j++) {
                    tmp+=arr[j];
                }
                if(tmp>maxsum) maxsum=tmp;
            }
            System.out.println(maxsum);
        }
    }
}