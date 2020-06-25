package Practice.Begineer.RD19;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * RD19
 */


//  It makes no sense to remove any elements, 
//  since any such operation doesn’t decrease the GCD and increase the number of deletions. 
//  Therefore the answer is 0 if the GCD of the original array is 1, -1 otherwise.


public class RD19 {

    static int gcd(int a,int b){
        if(a==0) return b;
        else if(b==0) return a;
        if(a>b) return gcd(a%b, b);
        else return gcd(a, b%a);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] line= br.readLine().split(" ");
        
            int a = gcd(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
            for (int i = 2; i < line.length; i++) {
               a= gcd(a,Integer.parseInt(line[i]));
            }
            if(a==1) System.out.println("0");
            else System.out.println("-1");
        }
    }
}