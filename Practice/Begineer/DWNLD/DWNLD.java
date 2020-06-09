package Practice.Begineer.DWNLD;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class DWNLD {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            int[] time = new int[n];
            int[] speed = new int[n];
            for(int i=0;i<n;i++){
                line = br.readLine().split(" ");
                time[i]= Integer.parseInt(line[0]);
                speed[i] = Integer.parseInt(line[1]);
            }
            int charge=0;
            for(int i=0;i<n;i++){
                if(k>0){
                    if(k-time[i]>0){
                        k=k-time[i];
                    }
                    else{
                        time[i]=time[i]-k;
                        k=0;
                        charge=charge+ time[i] * speed[i];
                    }
                }else{
                    charge=charge+ time[i] * speed[i];
                }
            }
            System.out.println(charge);
        }
    }    
}