package Practice.Begineer.CNDLOVE;

/**
 * CNDLOVE
 */
import java.io.*;
class CNDLOVE {

    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" ");
            int sum=0;
            for (int i = 0; i < n; i++) {
                sum+=Integer.parseInt(s[i]);
            }
            if(sum%2==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }    
}