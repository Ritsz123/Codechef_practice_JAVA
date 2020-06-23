package Practice.Begineer.LIFELTD;

/**
 * LIFELTD
 */
import java.io.*;
public class LIFELTD {

    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            char[][] arr= new char[3][];
            for (int i = 0; i < 3; i++) {
                char[] s = br.readLine().toCharArray();
                arr[i]=s;
            }
            boolean isL=false;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if(arr[i][j]=='l'){
                        if(arr[i+1][j]=='l'){
                            if(arr[i+1][j+1]=='l'){
                                isL=true;
                                break;
                            }
                        }
                    }
                }
            }
            if(isL)System.out.println("yes");
            else System.out.println("no");
        }
    }
}