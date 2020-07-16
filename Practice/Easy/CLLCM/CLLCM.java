package Practice.Easy.CLLCM;

/**
 * CLLCM
 * 
 */

    // Chef has to find an odd number which is an multiple of all N numbers that he has with him
    // basically lcm of all nos he has should be odd but lcm will be off only if all numbers are odd
    // so just check if there contains any even number in the list if so answer is NO 

import java.io.*;
public class CLLCM {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t--!=0) {
            int n = Integer.parseInt(br.readLine());
            int [] arr = new  int[n];
            String[] line = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i]=Integer.parseInt(line[i]);
            }
            boolean isPossible = true;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]%2==0){
                    isPossible=false;
                    break;
                }
            }
            if(isPossible) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}