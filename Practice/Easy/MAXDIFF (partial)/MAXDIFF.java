

/**
 * MAXDIFF
 */

/**
 * MAXDIFF
 */
import java.io.*;
import java.util.Arrays;
class MAXDIFF {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String [] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            String[] line2 = br.readLine().split(" ");
            int [] arr = new  int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(line2[i]);
            }
            Arrays.sort(arr);
            long weightA=0;
            long weightB=0;
            
            if(k>(n/2)){
                for(int i=0;i<n;i++){
                    if(i<n-k){
                        weightA+=arr[i];
                    }else weightB+=arr[i];
                }        
            }else{
                for (int i = 0; i < arr.length; i++) {
                    if(i<k){
                        weightA+=arr[i];
                    }else weightB+=arr[i];
                } 
            }
            long diff = Math.abs(weightA-weightB);
            System.out.println(diff);
        }
    }
}