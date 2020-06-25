package Practice.Begineer.CHEALG;

/**
 * CHEALG
 */
import java.io.*;
class CHEALG {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String str= br.readLine();
            String newStr = "";
            char ch='%';
            int count=0;
            for (int i = 0; i < str.length(); i++) {
                if(ch=='%'){
                    ch=str.charAt(i);
                    count++;
                }else if(ch==str.charAt(i)){
                    count++;
                }else if(ch!=str.charAt(i)){
                    newStr+=Character.toString(ch)+ Integer.toString(count);
                    ch=str.charAt(i);
                    count=1;
                }
            }
            newStr+=Character.toString(ch)+ Integer.toString(count);
            if(newStr.length()<str.length()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}