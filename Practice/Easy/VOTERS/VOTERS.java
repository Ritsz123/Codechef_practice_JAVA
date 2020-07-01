package Practice.Easy.VOTERS;

/**
 * VOTERS
 */
    //Using 2 SET


import java.io.*;
import java.util.*;
class VOTERS {

    public static void main(String[] args)  throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int a1 = Integer.parseInt(line[0]);
        int a2 = Integer.parseInt(line[1]);
        int a3 = Integer.parseInt(line[2]);
        Set<Integer> set = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        int n = a1+a2+a3;
        
        for (int i = 0; i < n; i++) {
            int num =Integer.parseInt(br.readLine());
            if(!set.add(num)){
                ans.add(num);
            }
        }
        
        Object[] al = ans.toArray();
        Arrays.sort(al);
        System.out.println(al.length);
        for (int i = 0; i < al.length; i++) {
            System.out.println(al[i]);    
        }
        
    }
}