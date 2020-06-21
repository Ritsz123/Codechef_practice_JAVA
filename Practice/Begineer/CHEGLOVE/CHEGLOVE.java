package Practice.Begineer.CHEGLOVE;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * CHEGLOVE
 */
public class CHEGLOVE {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            String[] line2 = br.readLine().split(" ");
            int[] sh = new int[n];
            int [] ch = new int[n];
            for (int i = 0; i < n; i++) {
                sh[i]=Integer.parseInt(line[i]);
                ch[i]=Integer.parseInt(line2[i]);
            }
            boolean canFitFront = true;
            boolean canFitBack = true;
            for (int i= 0; i < n; i++) {
                if(sh[i]>ch[i]){
                    canFitFront=false;
                }
            }
            for (int i = 0; i < n; i++) {
                if(sh[n-1-i]>ch[i]){
                    canFitBack=false;
                }
            }
            if (canFitBack && canFitFront) {
                System.out.println("both");
            }else if(canFitFront && !canFitBack){
                System.out.println("front");
            }else if(!canFitFront && canFitBack){
                System.out.println("back");
            }else System.out.println("none");
        }
    }
}