package Practice.Begineer.BIGSALE;

/**
 * BIGSALE
 */
import java.io.*;
public class BIGSALE {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            double loss = 0;
            while(n-->0){
                String[] line = br.readLine().split(" ");
                double oldprice = Integer.parseInt(line[0]);
                int q = Integer.parseInt(line[1]);
                double d = Double.parseDouble(line[2])/100;
                double tn = (oldprice + oldprice*d);
                double newPrice = tn-(tn*d);
                loss+=(oldprice-newPrice)*q;

            }
            System.out.println(loss);
        }
    }
}