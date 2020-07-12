package Practice.Easy.CHEFA;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class CHEFA {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t--!=0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            ArrayList<Long> al = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                al.add(Long.parseLong(line[i]));
            }
            al.sort(Collections.reverseOrder());
            long count=0;
            for (int i = 0; i < n; i++) {
                if(i%2==0){
                    count+=al.get(i);
                }
            }
            System.out.println(count);
        }
    }
}