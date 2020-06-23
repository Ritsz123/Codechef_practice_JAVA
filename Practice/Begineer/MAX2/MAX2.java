package Practice.Begineer.MAX2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * MAX2
 */
public class MAX2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String l = br.readLine();
        System.out.println((n-1-l.lastIndexOf('1')));
    }
}