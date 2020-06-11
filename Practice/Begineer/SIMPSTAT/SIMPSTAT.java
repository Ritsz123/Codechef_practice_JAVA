package Practice.Begineer.SIMPSTAT;
import java.io.*;
import java.util.Arrays;
class SIMPSTAT {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t-->0){
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            String[] line2 = br.readLine().split(" ");
            int [] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(line2[i]);
            }
            Arrays.sort(arr);
            int sum=0;
            for(int i=k;i<n-k;i++){
                sum+=arr[i];
            }
            double avg = (double) sum/(n-2*k);
            System.out.println(String.format("%.6f", avg));
        }
    }
}