package Practice.Begineer.CHNGOR;
import java.io.*;
/**
 * CHNGOR
 */
class CHNGOR {

    public static void main(String[] args)  throws Exception{

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int cost=0;
            for (int i = 0; i < n; i++) {
                cost=(cost | Integer.parseInt(line[i])); //silly Mistake don't do cost+= here
            }
            System.out.println(cost);
        }
    }
}