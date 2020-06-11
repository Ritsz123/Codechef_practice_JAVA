import java.io.*;
import java.util.ArrayList;
class TICKETS5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            char[] str = br.readLine().toCharArray();
            String temp ="";
            for(int i=0;i<str.length;i++){
                if(temp.equals("")){
                    temp+=str[i];
                }else if(temp.indexOf(str[i])<0){
                    temp+=str[i];
                }else break;
            }
            Boolean isPossible = true;
            for(int i=0;i<str.length-2;i++){
                if(new String(str).substring(i, i+2).equals(temp)){
                    i++;
                }else{
                    isPossible=false;
                    break;
                }
            }
            if(isPossible) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}