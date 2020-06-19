package Practice.Begineer.XENTASK;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * XENTASK
 */
class XENTASK {

    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] line1 = br.readLine().split(" ");
            String[] line2 = br.readLine().split(" ");
            int aCount=0;
            int bCount=0;
            
            for (int i = 0; i < n; i++) {
                int tmp = Integer.parseInt(line1[i]);
                int tmp1 = Integer.parseInt(line2[i]);
                if(i%2==1){
                    aCount+=tmp;
                    bCount+=tmp1;
                }else{
                    aCount+=tmp1;
                    bCount+=tmp;
                }
            }
            System.out.println(Math.min(aCount, bCount));
        }
    }
}