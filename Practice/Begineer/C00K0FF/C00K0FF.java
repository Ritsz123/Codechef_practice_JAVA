package Practice.Begineer.C00K0FF;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * C00K0FF
 */
public class C00K0FF {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] prob = new String[n];
            for (int i = 0; i < n; i++) {
                prob[i]=br.readLine();
            }
            int ck,sm,e,em,m,mh,h;
            ck=sm=e=em=m=mh=h=0;
            for (int i = 0; i < n; i++) {
                if(prob[i].equals("cakewalk")) ck++; else
                if(prob[i].equals("simple")) sm++; else
                if(prob[i].equals("easy")) e++; else
                if(prob[i].equals("easy-medium")) em++; else
                if(prob[i].equals("medium")) m++; else
                if(prob[i].equals("medium-hard")) mh++; else
                if(prob[i].equals("hard")) h++;
            }
            if(ck>=1 && sm>=1 && e>=1 &&(em>=1 || m>=1) && (mh>=1 || h>=1)){
                System.out.println("Yes");
            }else System.out.println("No");
        }
    }
}