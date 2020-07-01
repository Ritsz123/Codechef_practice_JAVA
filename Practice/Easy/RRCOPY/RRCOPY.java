package Practice.Easy.RRCOPY;

/**
 * RRCOPY
 */
import java.io.*;
import java.util.*;
public class RRCOPY {

   public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int t = Integer.parseInt(br.readLine());
       while(t-->0){
           int n = Integer.parseInt(br.readLine());
           String[] line = br.readLine().split(" ");
           Set<Integer> set = new HashSet<>();
           for (int i = 0; i < n; i++) {
               set.add(Integer.parseInt(line[i]));
           }
           System.out.println(set.size());
       }
   } 
}