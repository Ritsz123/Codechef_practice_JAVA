package Practice.Begineer.KTTABLE;

import java.io.*;
class KTTABLE {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n =Integer.parseInt(br.readLine());
            int[] time = new int[n];
            String[] line = br.readLine().split(" ");
            for(int i=0;i<n;i++){
                time[i]=Integer.parseInt(line[i]);
            }
            int [] timeR = new int[n];
            line = br.readLine().split(" ");
            for(int i=0;i<n;i++){
                timeR[i]=Integer.parseInt(line[i]);
            }
            int prev=0;
            int count=0;
            for(int i=0;i<n;i++){
                int givenTime = time[i]-prev;
                prev=time[i];
                int requiredTime = timeR[i];
                if(givenTime>=requiredTime)
                count++;
            }
            System.out.println(count);
        }
    }
}