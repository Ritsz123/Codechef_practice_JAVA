package Practice.Begineer.CHEFAPAR;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * CHEFAPAR
 */
public class CHEFAPAR {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int count=0;
            int fail=-1;
            for (int i = 0; i < n; i++) {
                if(Integer.parseInt(line[i])==0){
                    count++;
                    if(fail<0) fail=i;
                }
            }
            if(fail!=-1){
                int totalPayment = count*1000 + (n-fail)*100;
                System.out.println(totalPayment);
            }else System.out.println("0");
            
        }
    }
}