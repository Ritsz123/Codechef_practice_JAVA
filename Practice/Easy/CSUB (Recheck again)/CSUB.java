
/**
 * CSUB
 */

 //FORMULA FOR CALCULATION IS 
 // (n*(n+1))/2 WHERE n = NUMBER OF 1's IN THE STRING.


 
import java.io.*;
class CSUB {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            int count=0;
            for (int i = 0; i < str.length(); i++) {
               if(str.charAt(i)=='1'){
                   count++;
               }
            }
            System.out.println((count*(count+1))/2);
        }
    }
}