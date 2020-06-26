package Practice.Begineer.TWEED;

/**
 * TWEED
 */

    // the player picking odd coins can convert even number to odd by simply picking 1,3,5 etc coins so he will always try to keep 1 coin in the pile
    // the player picking even coins can ONLY WIN IF HE WINS IN THE FIRST TRY else not

import java.io.*;
public class TWEED {

    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            String plr=  line[1];
            String[] line2 = br.readLine().split(" ");
            int[] pile = new int[n];
            for (int i = 0; i < pile.length; i++) {
                pile[i]=Integer.parseInt(line2[i]);
            }
            boolean flag = true;
            if(n==1 && plr.equals("Dee")){
                if(pile[0]%2==0){
                    flag=false;
                }
            }
            if(flag) System.out.println("Dum");
            else System.out.println("Dee");
        }
    }
}