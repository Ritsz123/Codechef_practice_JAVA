package Practice.Begineer.STRLBP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * STRLBP
 */
class STRLBP {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while (t-->0) {
            char[] str = br.readLine().toCharArray();
            int count=0;
            for (int i = 0; i < str.length-1; i++) {
                if(str[i]!=str[i+1]){
                    count++;
                }
            }
            if (count<=2) {
                System.out.println("uniform");
            }else System.out.println("nom-uniform");
            
        }
    }
}