package Practice.Begineer.CFRTEST;

import java.io.*;
import java.util.Arrays;
class CFRTEST{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int[] nos = new int[n];
            for(int i=0;i<n;i++){
                nos[i]=Integer.parseInt(line[i]);
            }
            Arrays.sort(nos);
            int count=1;
            for(int i=1;i<n;i++){
                if(nos[i-1]!=nos[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}