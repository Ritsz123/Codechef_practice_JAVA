package Practice.Begineer.ELEVSTRS;

/**
 * ELEVSTRS
 */
import java.io.*;

class ELEVSTRS {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int n;
            double v1, v2;
            n = Integer.parseInt(line[0]);
            v1 = Double.parseDouble(line[1]);
            v2 = Double.parseDouble(line[2]);

            double time1, time2;
            time1 = (Math.sqrt(2) * n) / v1;
            time2 = (2 * n) / v2;
            if (time1 > time2) {
                System.out.println("Elevator");
            } else
                System.out.println("Stairs");
        }
    }
}
