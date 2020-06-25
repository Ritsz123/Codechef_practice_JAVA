
/**
 * CATFEED
 */
 //Editorial https://discuss.codechef.com/t/catfeed-editorial/39488
import java.io.*;
class CATFEED {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);
            String[] line2 = br.readLine().split(" ");
            int [] cats = new int[n];
            boolean flag= true;
            for (int i = 0; i < m; i++) {
                int cat = Integer.parseInt(line2[i]);
                int c = cats[cat-1]+1;
                for (int j = 0; j < cats.length; j++) {
                    if(j!=cat-1){
                        if(cats[j]<=cats[cat-1]){
                        flag=false;
                        break;
                        }    
                    }
                    
                }
                cats[cat-1]=c;
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}