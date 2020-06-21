package Practice.Begineer.DIET;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * DIET
 */
class DIET {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            String[] line2 = br.readLine().split(" ");
            int rem=0;
            int[] days = new int[n];
            for (int i = 0; i < n; i++) {
                days[i]=Integer.parseInt(line2[i]);
            }
            boolean isSuccess=true;
            int dayCount=-1;
            for (int i = 0; i < days.length; i++) {
                if((days[i]+rem-k)<0){
                    isSuccess=false;
                    dayCount=i+1;
                    break;
                }else{
                    rem = days[i]+rem- k;
                }                
            }
            if(isSuccess) System.out.println("YES");
            else System.out.println("NO "+ dayCount);
        }
    }
}