package Practice.Begineer.GDOG;

import java.io.*;
class GDOG {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            int maxrem=0;
            for(int i=2;i<=k;i++){
                if(n%i > maxrem)
                maxrem=n%i;
            }
            System.out.println(maxrem);
        }
    }
}