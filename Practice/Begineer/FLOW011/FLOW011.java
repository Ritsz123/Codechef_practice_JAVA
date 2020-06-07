import java.io.BufferedReader;
import java.io.InputStreamReader;

class FLOW011 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int sal = Integer.parseInt(br.readLine());
            double hra,da,grossSAlary;
            if(sal<1500){
                hra = sal * 0.10;
                da = sal * 0.90;
            }else{
                hra=500;
                da = sal * 0.98;
            }
            grossSAlary = sal + hra + da;
            System.out.println(String.format("%.2f", grossSAlary));
        }
    }
}