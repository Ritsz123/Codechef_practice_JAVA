package Practice.Begineer.AVG;
import java.io.*;
/**
 * AVG
 */
class AVG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            int v = Integer.parseInt(line[2]);
            String[] line2 = br.readLine().split(" ");
            int sum=0;
            for (int i = 0; i < line2.length; i++) {
                sum+=Integer.parseInt(line2[i]);
            }
            int sumlost = (v * (n+k)) - sum;
            if (sumlost>0 && sumlost%k==0) {
                System.out.println(sumlost/k);
            }else{
                System.out.println("-1");
            }
        }       
    }
}