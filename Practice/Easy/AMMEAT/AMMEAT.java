package Practice.Easy.AMMEAT;

/**
 * AMMEAT
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class AMMEAT {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t--!=0) {
            String [] line= br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            Long m = Long.parseLong(line[1]);
            String[] line2 = br.readLine().split(" ");
            ArrayList<Long> al = new ArrayList<>();
            long sum=0;
            for (int i = 0; i < n; i++) {
                al.add(Long.parseLong(line2[i]));
            }
            al.sort(Collections.reverseOrder());
            int count=0;
            while (sum<m && count<al.size()) {
                sum+=al.get(count);
                count++;
            }
            if(sum>=m)
            System.out.println(count);
            else System.out.println("-1");
        }
    }
}