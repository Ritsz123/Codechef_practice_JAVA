package Practice.Begineer.MNMX;

/**
 * MNMX
 */
import java.io.*;
public class MNMX {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t--!=0) {
            int n = Integer.parseInt(br.readLine());
            String [] line = br.readLine().split(" ");
            int[] arr = new  int[n];
            long min = Long.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                arr[i]=Integer.parseInt(line[i]);
                if(arr[i]<min) min = arr[i];
            }
            long ans = min * (n-1);
            System.out.println(ans);
        }
    }
}