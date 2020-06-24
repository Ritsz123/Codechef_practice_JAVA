package Practice.Begineer.UWCOI20A;

/**
 * UWCOI20A
 */
import java.io.*;
public class UWCOI20A {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while (t-->0) {
            long max = Long.MIN_VALUE;
            int n = Integer.parseInt(br.readLine());
            while (n-->0) {
                long num = Long.parseLong(br.readLine());
                if(num>max) max=num;
            }
            System.out.println(max);      
        }
    }
}