package Practice.Begineer.TWOSTR;

import java.io.*;
class TWOSTR {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            char[] s1 = br.readLine().toCharArray();
            char[] s2 = br.readLine().toCharArray();
            for(int i=0;i<s1.length;i++){
                if(s1[i]=='?' && s2[i]!='?'){
                    s1[i]=s2[i];
                }else if(s2[i]=='?' && s1[i]!='?'){
                    s2[i]=s1[i];
                }else if(s1[i]=='?' && s2[i]=='?'){
                    s1[i]=s2[i]='a';
                }
            }
            if(new String(s1).equals(new String(s2))){
                System.out.println("Yes");
            }else
            System.out.println("No");
        }
    }
}