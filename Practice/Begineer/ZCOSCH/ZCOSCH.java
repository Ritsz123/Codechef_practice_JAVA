package Practice.Begineer.ZCOSCH;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ZCOSCH
 */
public class ZCOSCH {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long r = Long.parseLong(br.readLine());
        if(r>100){
            System.out.println("0");
        }else if(r<101 && r>50) System.out.println("50");
        else System.out.println("100");
    }
}