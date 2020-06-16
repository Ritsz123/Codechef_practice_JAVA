package Practice.Begineer.MUFFINS3;

import java.util.*;
import java.io.*;
class MuffinS3 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int num = (n/2)+1;
            System.out.println(num);
            
        }
    }    
}