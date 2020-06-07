import java.io.*;
import java.math.BigInteger;
class Fctrl2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            System.out.println(fact(n));
        }
    }
    static BigInteger fact(int n){
        BigInteger b = BigInteger.ONE;
        for(int i=2;i<=n;i++){
            b = b.multiply(BigInteger.valueOf(i));
        }
        return b;
    }
}