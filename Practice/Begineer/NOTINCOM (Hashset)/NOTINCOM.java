
import java.io.*;
import java.util.*;

/**
 * NOTINCOM
 */
class NOTINCOM {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);
            String[] nC = br.readLine().split(" ");
            String[] mC = br.readLine().split(" ");
            int [] al = new int[n];
            HashSet<Integer> hs = new HashSet<>();
            for (int i = 0; i <n; i++) {
                al[i]=Integer.parseInt(nC[i]);
            }
            for (int i = 0; i < m; i++) {
                hs.add(Integer.parseInt(mC[i]));
            }
            int count=0;
            for (int i = 0; i < n; i++) {
                if(hs.contains(al[i]))
                count++;
            }
            System.out.println(count);
        }
    }
    
}