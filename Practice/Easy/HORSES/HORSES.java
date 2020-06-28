package Practice.Easy.HORSES;

/**
 * HORSES
 */
import java.io.*;
import java.util.Arrays;
class HORSES {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            long[] arr= new long[n];
            for (int i = 0; i < line.length; i++) {
                arr[i]=Long.parseLong(line[i]);
            }
            Arrays.sort(arr);
            long mindiff=Integer.MAX_VALUE;
            for (int i = 0; i < arr.length-1; i++) {
                long dif =arr[i+1]-arr[i]; 
                if(dif<mindiff) mindiff = dif;
            }
            System.out.println(mindiff);
        }
    }
}