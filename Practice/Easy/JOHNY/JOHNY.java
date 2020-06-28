package Practice.Easy.JOHNY;

/**
 * JOHNY
 */
import java.io.*;
import java.util.Arrays;
class JOHNY {

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int [] arr =new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=Integer.parseInt(line[i]);
            }
            int k = Integer.parseInt(br.readLine());
            int num = arr[k-1];
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==num) System.out.println(i+1);
            }
        }  
    }
}