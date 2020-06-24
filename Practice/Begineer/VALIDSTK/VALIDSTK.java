package Practice.Begineer.VALIDSTK;

/**
 * VALIDSTK
 */
import java.io.*;
public class VALIDSTK {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int top=-1;
            boolean isValid=true;
            for (int i = 0; i < n; i++) {
                if(Integer.parseInt(line[i])==1){
                    top++;
                }else{
                    if(top<0){
                        isValid=false;
                        break;
                    }else top--;   
                }
            }
            if(isValid) System.out.println("Valid");
            else System.out.println("Invalid");
        }
    }
}