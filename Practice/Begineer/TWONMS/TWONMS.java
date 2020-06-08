package Practice.Begineer.TWONMS;
import java.io.*;
class TWONMS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] line = br.readLine().split(" ");
            long a = Long.parseLong(line[0]);
            long b = Long.parseLong(line[1]);
            long n = Long.parseLong(line[2]);
            
            if(n%2==1){
                n=n*2;
            }
            long ans = Math.max(a, b)/Math.min(a, b);
            System.out.println(ans);
        }
    }
}