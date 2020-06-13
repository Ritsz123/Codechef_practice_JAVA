package Practice.Begineer.ANKTRAIN;

import java.io.*;
class ANKTRAIN {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int temp = n%8;
            int partner=-1;
            String prefix="";
            switch(temp){
                case 0: partner = n-1; prefix="SL"; break;
                case 7: partner = n+1; prefix="SU"; break;
                case 1:
                case 2: 
                case 3: partner = n+3; 
                        if(temp==1) prefix = "LB";
                        else if(temp==2) prefix ="MB";
                        else prefix = "UB";
                        break;
                case 4:
                case 5:
                case 6: partner = n-3;
                        if(temp==4) prefix = "LB";
                        else if(temp==5) prefix ="MB";
                        else prefix = "UB";
                        break;
            }
            System.out.println(partner+prefix);

        }
    }
}