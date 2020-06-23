package Practice.Begineer.ISITCAKE;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ISITCAKE
 */
public class ISITCAKE {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int count=0;
            for (int i = 0; i < 10; i++) {
                String[] line = br.readLine().split(" ");
                for (int j = 0; j < 10; j++) {
                    int tm = Integer.parseInt(line[j]);
                    if(tm<=30){
                        count++;
                    }
                }
            }
            if (count>=60) {
                System.out.println("yes");
            }else System.out.println("no");
        }
    }
}