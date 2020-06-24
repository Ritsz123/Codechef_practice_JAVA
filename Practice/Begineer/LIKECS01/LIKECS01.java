package Practice.Begineer.LIKECS01;

/**
 * LIKECS01
 */
import java.io.*;
import java.util.Arrays;
public class LIKECS01 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            char [] chr = br.readLine().toCharArray();
            int count=0;
            for (int i = 0; i < chr.length; i++) {
                for (int j = i+1; j < chr.length; j++) {
                    if(chr[i]==chr[j]){
                        count++;
                    }
                }
            }
            if(count>0) System.out.println("yes");
            else System.out.println("no");
        }
    }
}