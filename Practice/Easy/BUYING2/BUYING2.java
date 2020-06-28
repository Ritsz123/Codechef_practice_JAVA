package Practice.Easy.BUYING2;

/**
 * BUYING2
 */
import java.io.*;
 class BUYING2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] line=  br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k =Integer.parseInt(line[1]);
            String[] line2 = br.readLine().split(" ");
            int [] arr= new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=Integer.parseInt(line2[i]);
            }
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum+=arr[i];
            }
            int Quantity = sum/k;
            int rem = sum%k;
            boolean flag = true;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]<=rem){
                    flag=false;
                    break;
                }
            }
            if (flag) {
                System.out.println(Quantity);
            }else System.out.println("-1");
        }
    }
}