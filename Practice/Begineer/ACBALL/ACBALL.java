package Practice.Begineer.ACBALL;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ACBALL
 */
public class ACBALL {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while (t-->0) {
            char[] x = br.readLine().toCharArray();
            char[] y = br.readLine().toCharArray();
            char[] z = new char[x.length];
            for (int i = 0; i < x.length; i++) {
                if (x[i]=='W' && x[i]==y[i]) {
                    z[i]= 'B';
                }else if (x[i]=='B' && x[i]==y[i]) {
                    z[i]='W';
                } else if(x[i]=='W' && y[i]!=x[i]){
                    z[i]='B';
                }else if(x[i]=='B' && y[i]!=x[i]){
                    z[i]='B';
                }
            }
            System.out.println(new String(z));

        }
    }
}