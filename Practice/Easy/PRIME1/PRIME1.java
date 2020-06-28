package Practice.Easy.PRIME1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * PRIME1
 */
public class PRIME1 {

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            
            for (int i = a; i <= b; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
            System.out.println();
           
        }
    }
    static boolean isPrime(int n){
        if(n==1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}