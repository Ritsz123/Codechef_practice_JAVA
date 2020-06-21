package Practice.Begineer.FANCY;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * FANCY
 */
public class FANCY {

    public static void main(String[] args) throws Exception {
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] s = br.readLine().split(" ");
            boolean isNot=false;
            for (int i = 0; i < s.length; i++) {
                if(s[i].equals("not")){
                    isNot=true;
                }
            }
            if (isNot) {
                System.out.println("Real Fancy");
            }else System.out.println("regularly fancy");
        }
    }
}