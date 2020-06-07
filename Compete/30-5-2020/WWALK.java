import java.util.*;
import java.io.*;
import java.math.BigInteger;
class WWALK {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            String[] a = br.readLine().split(" ");
            String[] b = br.readLine().split(" ");
            BigInteger wD=BigInteger.ZERO;
            BigInteger dA=BigInteger.ZERO;
            BigInteger dB=BigInteger.ZERO;
            for(int i=0;i<n;i++){
                int x = Integer.parseInt(a[i]);
                int y = Integer.parseInt(b[i]);
                dA = dA.add(BigInteger.valueOf(x));
                dB = dB.add(BigInteger.valueOf(y)); 
                if(dA.equals(dB) && x==y){
                    wD = wD.add(BigInteger.valueOf(x));
                }
            }
            System.out.println(wD);
        }   
    }
}