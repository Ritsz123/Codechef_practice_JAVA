package Practice.Begineer.CHN15A;

import java.io.*;
class CHN15A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t-->0){
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            String[] line2 = br.readLine().split(" ",n);
            int count=0;
            for(int i=0;i<n;i++){
                int a = Integer.parseInt(line2[i]) + k;
                if(a%7==0)
                count++;
            }
            System.out.println(count);
        }
    }
}