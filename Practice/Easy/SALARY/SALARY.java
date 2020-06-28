package Practice.Easy.SALARY;

/**
 * SALARY
 */
import java.io.*;
import java.util.Arrays;
public class SALARY {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int [] arr= new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=Integer.parseInt(line[i]);
            }
            int count=0;
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                count+=arr[i]-arr[0];
            }
            System.out.println(count);
        }
    }
}