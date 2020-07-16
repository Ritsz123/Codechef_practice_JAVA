package Practice.Begineer.FRGTNLNG;

/**
 * FRGTNLNG
 */
import java.io.*;
import java.util.*;
public class FRGTNLNG {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t--!=0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            String[] line2 = br.readLine().split(" ");
            ArrayList<String> al = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                al.add(line2[i]);
            }
            HashSet<String> hs = new HashSet<>();
            while (k--!=0) {
                String[] line3 = br.readLine().split(" ");
                int nums = Integer.parseInt(line3[0]);
                for (int i = 1; i <= nums ; i++) {
                    hs.add(line3[i]);
                }
            }
            for (int i = 0; i < al.size(); i++) {
                if(hs.contains(al.get(i))){
                    System.out.print("YES ");
                }else{
                    System.out.print("NO ");
                }
            }
            System.out.println();
        }
    }
}