package Practice.Begineer.TTENIS;

import java.io.*;
class TTENIS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            char[] str = br.readLine().toCharArray();
            int p1=0;int p2=0;
            for(int i=0;i<str.length;i++){
                if(p1==10 && p2==10){
                    while(true){
                        if(str[i]=='1')
                        p1++;
                        else p2++;
                        i++;
                        if(p1-p2==2){
                            System.out.println("WIN");
                            break;
                        }else if(p2-p1==2){
                            System.out.println("LOSE");
                            break;
                        }
                    
                    }
                }else{
                    if(str[i]=='1')
                    p1++;
                    else p2++;
                    if(p1==11){
                        System.out.println("WIN");
                        break;
                    }else if(p2==11){
                        System.out.println("LOSE");
                        break;
                    }
                }
            }
        }
    }
}