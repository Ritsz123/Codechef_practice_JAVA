package Practice.Begineer.TALAZY;

/**
 * TALAZY
 */
import java.io.*;

class TALAZY {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            long n, b, m;
            n = Long.parseLong(line[0]);
            b = Long.parseLong(line[1]);
            m = Long.parseLong(line[2]);
            long time = 0;

            while (n != 0) {
                long p = (n + 1) / 2;
                n = n - p;
                time += p * m;
                if (n != 0)
                    time += b;
                m = m * 2;
            }
            System.out.println(time);
        }

    }
}
