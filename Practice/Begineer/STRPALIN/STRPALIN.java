package Practice.Begineer.STRPALIN;
import java.io.*;
class STRPALIN {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            char[] s1 = br.readLine().toCharArray();
            String s2 = br.readLine();
            boolean flag=false;
            for(int i=0;i<s1.length;i++){
                if(s2.indexOf(s1[i])>-1)
                {
                    flag=true;
                    break;
                }
            }
            if(flag) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}