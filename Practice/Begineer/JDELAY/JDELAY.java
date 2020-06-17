package Practice.Begineer.JDELAY;

/**
 * JDELAY
 */
import java.io.*;
public class JDELAY {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            int count=0;
            for (int i = 0; i < n; i++) {
                String[] line = br.readLine().split(" ");
                int s= Integer.parseInt(line[0]);
                int tm = Integer.parseInt(line[1]);
                int timeTaken = tm-s;
                if(timeTaken>5)
                count++;
            }
            System.out.println(count);
        }
    }
}