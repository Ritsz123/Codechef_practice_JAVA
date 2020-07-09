package Practice.Easy.ANUBTG;

import java.io.*;
import java.util.*;

/**
 * ANUBTG
 */
class ANUBTG {

    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t--!=0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = 0; i < n; i++) {
               al.add(Integer.parseInt(line[i]));
            }
            al.sort(Collections.reverseOrder());
            int sum=0;
            for (int i = 0; i < al.size(); i++) {
                if(i%4==0 || i%4==1){
                    sum+=al.get(i);
                }
            }
            System.out.println(sum);
        }
    }    
}