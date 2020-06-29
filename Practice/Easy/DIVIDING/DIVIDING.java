package Practice.Easy.DIVIDING;

/**
 * DIVIDING
 */
import java.io.*;

class DIVIDING {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        long sum=0;
        long sumN=0;
        for (int i = 0; i < n; i++) {
            sum+=(i+1);
            sumN+=Long.parseLong(line[i]);
        }
        if(sum==sumN){
            System.out.println("YES");
        }else System.out.println("NO");
    }    
}