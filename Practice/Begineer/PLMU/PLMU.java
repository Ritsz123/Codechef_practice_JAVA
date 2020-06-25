package Practice.Begineer.PLMU;

/**
 * PLMU
 */

    //Read the problem the only possible case here is numbers 0 & 2 (2+2 = 2*2) and (0+0 = 0*0)
    //therefore the solution is to find number of occurances of 2 and 0 then find the number of pairs each of them can form
    //usig formula [n*(n-1)/2] and add both of them

import java.io.*;
import java.util.Arrays;
public class PLMU {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            long [] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i]=Long.parseLong(line[i]);
            }
            Arrays.sort(arr);
            long zc=0;long tc=0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==0)zc++;
                else if(arr[i]==2)tc++;
            }
            long totalPairs = zc*(zc-1)/2 + tc*(tc-1)/2;
            if(totalPairs==0)System.out.println("0");
            else System.out.println(totalPairs);
        }
    }
}