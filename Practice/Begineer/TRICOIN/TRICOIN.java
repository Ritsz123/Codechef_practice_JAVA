package Practice.Begineer.TRICOIN;

import java.io.*;
class TRICOIN {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int sum=0;
            int i;
            for(i=1;sum<n;i++){
                if(sum+i>n)
                break;
                else
                sum+=i;
            }
            System.out.println(i-1);
        }
    }
}