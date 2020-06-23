package Practice.Begineer.MAXREM;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * MAXREM
 */
public class MAXREM {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        long [] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i]=Long.parseLong(line[i]);
        }
        long maxrem=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long num =arr[i]%arr[j];
                if(num>maxrem) maxrem = num;
            }
        }
        System.out.println(maxrem);
    }
}