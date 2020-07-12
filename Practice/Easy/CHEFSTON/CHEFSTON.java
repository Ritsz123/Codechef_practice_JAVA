package Practice.Easy.CHEFSTON;

/**
 * CHEFSTON
 */
import java.io.*;
class CHEFSTON {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t--!=0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            long k = Long.parseLong(line[1]);
            String[] times = br.readLine().split(" ");
            String[] prices = br.readLine().split(" ");
            long maxPrice=0;
            for (int i = 0; i < n; i++) {
                long time = Long.parseLong(times[i]);
                long price = Long.parseLong(prices[i]);
                long r = k/time;

                long total = price*r;
                if(total>maxPrice) maxPrice = total;
            }
            System.out.println(maxPrice);
        }
    }
}