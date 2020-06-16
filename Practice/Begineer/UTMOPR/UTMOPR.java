package Practice.Begineer.UTMOPR;

import java.io.*;
class TEMPLELA {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            String[] line2 = br.readLine().split(" ");
            int [] nos = new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                sum+= Integer.parseInt(line2[i]);
            }
            int num =sum+1;
            for (int i = 1; i < k; i++) {
                sum+=num;
                num=sum+1;
            }
            if(num%2==1) System.out.println("odd");
            else System.out.println("even");
            
            
        }
    }
}