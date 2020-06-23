package Practice.Begineer.CFMM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * CFMM
 */
public class CFMM {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            char[][] arr = new char[n][];
            for (int i = 0; i < n; i++) {
                arr[i] = br.readLine().toCharArray();
            }
            int c=0; int o=0; int d=0; int e=0;int h=0; int f=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    switch (arr[i][j]) {
                        case 'c': c++; break;
                        case 'o': o++; break;
                        case 'd': d++; break;
                        case 'e': e++; break;
                        case 'h': h++; break;
                        case 'f': f++; break;
                        default:
                            break;
                    }
                }
            }
            int count=0;
            while(c>=2 && o>=1 && d>=1 && e>=2 && h>=1 && f>=1){
                c-=2;
                o--;
                d--;
                e-=2;
                h--;
                f--;
                count++;
            }
            System.out.println(count);
        }
    
    }
}