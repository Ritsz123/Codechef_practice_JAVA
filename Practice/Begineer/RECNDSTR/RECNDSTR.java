package Practice.Begineer.RECNDSTR;

/**
 * RECNDSTR
 */
import java.io.*;
public class RECNDSTR {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String str = br.readLine();

            String s1= Lshift(str);
          	String s2 = Rshift(str);
            // System.out.println("Left shift " +s1);
            
            // System.out.println("Right shigt " +s2);
            if(s1.equals(s2)){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
    static String Lshift(String st){
		char[] s = st.toCharArray();
        char temp =s[0];
        for (int i=1; i < s.length; i++) {
            s[i-1]=s[i];
        }
        s[s.length-1]=temp;
        return new String(s);
    }
    static String Rshift(String st){
		char[] s = st.toCharArray();
        char temp = s[s.length-1];
        // System.out.println( " 0th pos b4 "+s[0]);
        for (int i = s.length-1; i>0; i--) {
            s[i]=s[i-1];
        }
        s[0]=temp;
        // System.out.println( " 0th pos after "+s[0]);
        return new String(s);
    }
}