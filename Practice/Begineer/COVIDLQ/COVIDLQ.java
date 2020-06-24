package Practice.Begineer.COVIDLQ;

/**
 * COVIDLQ
 */
import java.io.*;
public class COVIDLQ {

    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int dist=5;
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                int tmp = Integer.parseInt(line[i]);
                if(tmp==0){
                    dist++;
                }else if(tmp==1){
                    if(dist<5){
                        flag=false;
                        break;
                    }else{
                        dist=0;
                    }
                }
            }
            if (flag) {
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}