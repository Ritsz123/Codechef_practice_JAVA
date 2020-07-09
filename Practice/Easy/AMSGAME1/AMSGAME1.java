package Practice.Easy.AMSGAME1;

/**
 * AMSGAME1
 */
import java.io.*;
public class AMSGAME1 {

    static long gcd(long a,long b){
        if(a==0) return b;
        if(b==0) return a;
        if(a>b) return gcd(a%b, b);
        else return gcd(a, b%a);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            long [] arr = new  long[n];
            String[] line = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i]=Long.parseLong(line[i]);
            }
            long gcd = gcd(arr[0], arr[1]);
            for (int i = 2; i < line.length; i++) {
                gcd = gcd(gcd,arr[i]);
            }
            System.out.println(gcd);
        }
    }
}