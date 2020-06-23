package Practice.Begineer.SINS;

/**
 * SINS
 */
import java.io.*;

//Find GCD and do Accordingly

public class SINS {

    static long gcd(long a,long b){
        if(a==0) return b;
        if(b==0) return a;
        if(a>b) return gcd(a%b,b);
        else return gcd(a,b%a);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] line = br.readLine().split(" ");
            long x = Long.parseLong(line[0]);
            long y = Long.parseLong(line[1]);
            if(x%y==0) System.out.println(2*y);
            else if(y%x==0) System.out.println(2*x);
            else System.out.println(2*gcd(x, y)); 
        }
    }
}