package Practice.Begineer.CLIPLX;

import java.io.*;
class CLIPLX {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            int tm = x-y;
            if(tm<0)  System.out.println("0"); 
            else System.out.println(tm);
        }
    }
}