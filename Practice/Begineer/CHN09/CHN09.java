package Practice.Begineer.CHN09;

import java.io.*;
class CHN09{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            char[] str = br.readLine().toCharArray();
            int aCount=0;
            int bCount=0;
            for(int i=0;i<str.length;i++){
                if(str[i]=='a')
                aCount++;
                else if(str[i]=='b')
                bCount++;
            }
            System.out.println(Math.min(aCount, bCount));
        }
    }
}