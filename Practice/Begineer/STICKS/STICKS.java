package Practice.Begineer.STICKS;

import java.io.*;
import java.util.*;
class STICKS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int [] nos = new int[n];
            for(int i=0;i<n;i++){
                nos[i]= Integer.parseInt(line[i]);
            }
            Arrays.sort(nos);
            int a=0;int b=0;
            for(int i=nos.length-1;i>0;i--){
                if(nos[i]==nos[i-1]){
                    if(a==0)
                    a=nos[i];
                    else if(b==0)
                    b=nos[i];
                    else break;
                    i--;
                }
            }
            if(a!=0 && b!=0){
                System.out.println(a*b);
            }else System.out.println("-1");
        }
    }
}