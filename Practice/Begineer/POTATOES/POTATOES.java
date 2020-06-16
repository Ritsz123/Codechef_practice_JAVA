package Practice.Begineer.POTATOES;

import java.util.*;
import java.io.*;
class POTATOES {
    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] line = br.readLine().split(" ");
            int f1 = Integer.parseInt(line[0]);
            int f2 = Integer.parseInt(line[1]);
            int f3=1;

            int sum = f1+f2+f3;
            while(!isPrime(sum)){
                sum++;
                f3++;
            }
            System.out.println(f3);
        }
    }

    static boolean isPrime(int n){
        if(n==2)
        return true;
        boolean flag = true;
        for(int i=3;i<=n/2;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag)
        return true;
        else
        return false;
    }
}