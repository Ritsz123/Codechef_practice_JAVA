package Practice.Begineer.ENCMSG;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ENCMSG
 */
class ENCMSG {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            char[] s = br.readLine().toCharArray();
            for (int i = 0; i < s.length-1; i++) {
                char temp = s[i];
                s[i]=s[i+1];
                s[i+1]=temp;
                i++;
            }
            for (int i = 0; i < s.length; i++) {
                int m = (123-(int)s[i]) + 96;
                s[i]=(char)m;
            }
            System.out.println(new String(s));
        }
    }  
}