package Practice.Begineer.PAJAPONG;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * PAJAPONG
 */
public class PAJAPONG {

    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] line = br.readLine().split(" ");
            long x = Long.parseLong(line[0]);
            long y = Long.parseLong(line[1]);
            long k = Long.parseLong(line[2]);

            if(((x+y)/k)%2==0){
                System.out.println("Chef");
            }else System.out.println("Paja");
        }
    }
}