package Practice.Begineer.LIFTME;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * LIFTME
 */
public class LIFTME {

    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int q = Integer.parseInt(line[1]);
            long count=0;
            ArrayList<Integer> cmd = new ArrayList<>();
            for (int i = 0; i < q; i++) {
                String[] line1 = br.readLine().split(" ");
                int a = Integer.parseInt(line1[0]);
                int b = Integer.parseInt(line1[1]);
                cmd.add(a);
                cmd.add(b);
            }
            int pos=0;
            for (int i = 0; i < cmd.size(); i++) {
                int next=cmd.get(i);
                if(pos!=next){
                    if(next<pos){
                        count+=pos-next;
                        pos=next;
                        
                    }else if(next>pos){
                        count+=next-pos;
                        pos=next;
                        
                    }
                }
            }
            System.out.println(count);
        }
    }
}