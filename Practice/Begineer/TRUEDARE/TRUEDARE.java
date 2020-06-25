package Practice.Begineer.TRUEDARE;

/**
 * TRUEDARE
 */
import java.io.*;
import java.util.ArrayList;
class TRUEDARE {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n1 = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            ArrayList<Integer> tr = new ArrayList<>();
            for (int i = 0; i < n1; i++) {
                tr.add(Integer.parseInt(line[i]));
            }
            int n2 = Integer.parseInt(br.readLine());
            String[] line2 = br.readLine().split(" ");
            ArrayList<Integer> dr = new ArrayList<>();
            for (int i = 0; i < n2; i++) {
                dr.add(Integer.parseInt(line2[i]));
            }
            int n3 = Integer.parseInt(br.readLine());
            String[] line3 = br.readLine().split(" ");
            int [] ts = new int[n3];
            for (int i = 0; i < n3; i++) {
                ts[i]=Integer.parseInt(line3[i]);
            }
            int n4 = Integer.parseInt(br.readLine());
            String[] line4 = br.readLine().split(" ");
            int[] ds = new int[n4];
            for (int i = 0; i < n4; i++) {
                ds[i]=Integer.parseInt(line4[i]);
            }

            boolean flag=true;
            for (int i = 0; i < ts.length; i++) {
                if(!tr.contains(ts[i])) flag=false;
            }
            for (int i = 0; i < ds.length; i++) {
                if(!dr.contains(ds[i])) flag =false;
            }
            if (flag) {
                System.out.println("yes");
            }else System.out.println("no");

        }
    }
}