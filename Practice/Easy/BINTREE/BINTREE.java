package Practice.Easy.BINTREE;

/**
 * BINTREE
 */
import java.io.*;
class BINTREE {

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t--!=0) {
            String[] line = br.readLine().split(" ");
            long a = Long.parseLong(line[0]);
            long b = Long.parseLong(line[1]);
            
            int count=0;
            while (a!=b) {
                if(a>b){
                    a/=2;
                    count++;
                }
                if(b>a){
                    b/=2;
                    count++;
                }
            }
            System.out.println(count);
        }
        

    }
}