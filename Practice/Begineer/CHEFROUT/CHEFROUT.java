package Practice.Begineer.CHEFROUT;

/**
 * CHEFROUT
 */
import java.io.*;
class CHEFROUT {    

    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            char[] s = br.readLine().toCharArray();
            boolean isPossible=true;
            
            for (int i = 0; i < s.length-1; i++) {
                if(s[i]!=s[i+1]){
                    if(s[i]>s[i+1]){
                        isPossible=false;
                        break;
                    }
                }
            }

            if (isPossible) {
                System.out.println("yes");
            }else System.out.println("no");
        }
    }
    
}