package Practice.Begineer.CARSELL;

/**
 * CARSELL
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
 class CARSELL {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] line =br.readLine().split(" ");
            ArrayList<Long> arr =new ArrayList<>();
            for (int i = 0; i < line.length; i++) {
                arr.add(Long.parseLong(line[i]));
            }
            long price=0;
            arr.sort(Collections.reverseOrder());
            for (int i = 0; i < n; i++) {
                if((arr.get(i)-i)>=0)
                price+=arr.get(i)-i;
            }
            System.out.println(price%1000000007);
        }
    }
}