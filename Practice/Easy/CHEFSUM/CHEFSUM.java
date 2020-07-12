package Practice.Easy.CHEFSUM;

/**
 * CHEFSUM
 */

//  https://discuss.codechef.com/problems/CHEFSUM
//  the only repeted number is arr[i] to find minimum index of sum simply find the index of minimum element in arr and output in 1 index format
import java.io.*;
public class CHEFSUM {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t--!=0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int [] arr = new  int [n];
            for (int i = 0; i < n; i++) {
                arr[i]=Integer.parseInt(line[i]);
            }
            int min = Integer.MAX_VALUE;
            int minIndex=-1;
            for (int i = 0; i <= arr.length; i++) {
                if(arr[i]<min){
                    min=arr[i];
                    minIndex=i;
                }
            }
            System.out.println(minIndex+1);
        }
    }
}