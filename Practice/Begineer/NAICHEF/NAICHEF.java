package Practice.Begineer.NAICHEF;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * NAICHEF
 */
class NAICHEF {

    public static void main(String[] args) throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int a = Integer.parseInt(line[1]);
            int b = Integer.parseInt(line[2]);
            String[] line2 = br.readLine().split(" ");
            int []arr= new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=Integer.parseInt(line2[i]);
            }
            int acount=0;int bcount=0;
            for (int i = 0; i < n; i++) {
                if (arr[i]==a) acount++;
                if(arr[i]==b) bcount++;
            }
            double d = ((double)acount/n) * ((double)bcount/n);
            System.out.println(String.format("%f", d));
        }
    }
}