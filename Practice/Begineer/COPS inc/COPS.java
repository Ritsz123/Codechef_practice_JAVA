import java.io.*;
import java.util.ArrayList;

class COPS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] line = br.readLine().split(" ");
            int m = Integer.parseInt(line[0]);
            int x = Integer.parseInt(line[1]);
            int y = Integer.parseInt(line[2]);
            int speed = x*y;
            String[] line2 = br.readLine().split(" ");
            int count=100;
           
            for(int i=0;i<m;i++){
                int p = Integer.parseInt(line2[i]);
                if(count>0){
                    count= count-(p+speed)*2;
                }
            }
            System.out.println(count);
        }
    }    
}