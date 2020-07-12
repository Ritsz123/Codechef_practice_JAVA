package Practice.Easy.SUBGCD;

/**
 * SUBGCD
 */
import java.io.*;

// the largest subarray with gcd as 1 will be complete array if gcd of complete array is not 1 then the array doesnot contain any pair with gcd as 1
class SUBGCD {

    static int gcd(int a,int b){
        if(a==0) return b;
        if(b==0) return a;
        if(a>b) return gcd(a%b, b);
        else return gcd(a, b%a);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t--!=0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= Integer.parseInt(line[i]);
            }
            
            int gc = gcd(arr[0], arr[1]);
            for (int i = 2; i < arr.length; i++) {
                gc = gcd(gc, arr[i]);
            }
            if(gc==1){
                System.out.println(arr.length);
            }else System.out.println("-1");

        }
    }
}