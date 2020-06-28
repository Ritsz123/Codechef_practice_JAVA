

/**
 * MAXDIFF
 */
import java.io.*;
import java.util.Arrays;
public class MAXDIFF {

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
            int weightSon=0;
            int weightChef=0;
            for (int i = 0; i < arr.length; i++) {
                if(i<k){
                    weightSon+=arr[i];
                }else weightChef+=arr[i];
            }
            int diff = weightChef-weightSon;
            System.out.println(diff);
        }
    }
}