package Practice.Begineer.CHEFSTUD;

import java.io.*;
class CHEFSTUD {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            char[] str = br.readLine().toCharArray();
            for(int i=0;i<str.length;i++){
                if(str[i]=='>')
                str[i]='<';
                else if(str[i]=='<')
                str[i]='>';
            }
            int count=0;
            for(int i=1;i<str.length;i++){
                if(str[i-1]=='>' && str[i]=='<')
                count++;
            }
            System.out.println(count*2);
        }
    }
}