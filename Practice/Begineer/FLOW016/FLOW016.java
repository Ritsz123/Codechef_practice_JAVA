package Practice.Begineer.FLOW016;

import java.math.BigInteger;
import java.util.*;

class FLOW016 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(gcd(a,b) + " " + lcm(a,b));
        
        }

    }
    static int gcd(int a,int b){
        if(a==0)
        return b;
        if(b==0)
        return a;
        if(a==b)
        return a;
        if(a>b){
            return gcd(a-b, b);
        }
        else{
            return gcd(a,b-a);
        }
    }
    static BigInteger lcm(int a,int b){
        BigInteger bigint = BigInteger.valueOf(a);
        bigint = bigint.multiply(BigInteger.valueOf(b));
        return bigint.divide(BigInteger.valueOf(gcd(a, b)));
        // (a*b)/gcd(a,b);
    }
}