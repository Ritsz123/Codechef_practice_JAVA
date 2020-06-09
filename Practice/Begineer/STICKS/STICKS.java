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
            ArrayList<Integer> al = new ArrayList<>();
            for(int i=0;i<n;i++){
                nos[i]= Integer.parseInt(line[i]);
            }
            Arrays.sort(nos);
            
        }
    }
}