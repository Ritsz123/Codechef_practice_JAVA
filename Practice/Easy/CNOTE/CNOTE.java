package Practice.Easy.CNOTE;

/**
 * CNOTE
 */
import java.io.*;
class CNOTE {

    public static void main(String[] args)  throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String [] line= br.readLine().split(" ");
            int x =Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            int k = Integer.parseInt(line[2]);
            int n = Integer.parseInt(line[3]);
            int p[] = new int[n];
            int c[] = new int[n];
            for (int i = 0; i < n; i++) {
                String[] line2 = br.readLine().split(" ");
                p[i] = Integer.parseInt(line2[0]);
                c[i] = Integer.parseInt(line2[1]);
            }
            boolean flag=false;
            if(x>y){
                x-=y;
                for (int i = 0; i < n; i++) {
                    if(p[i]>=x && c[i]<=k){
                        flag=true;
                        break;
                    }
                }
            }else{
                flag=true;
            }
            if(flag) System.out.println("LuckyChef");
            else System.out.println("UnluckyChef");
        }
    }
}