package Practice.Begineer.CHFTIRED;

import java.io.BufferedReader;
import java.io.InputStreamReader;



/**
 * CHFTIRED
 */
public class CHFTIRED {
    //d is useless answer will be always yes as we need to choose 2 nos such that first - second-1 =0
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String l = br.readLine();
            System.out.println("YES");
        }
    }
}