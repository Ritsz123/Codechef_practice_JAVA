package Practice.Begineer.RECTANGL;

/**
 * RECTANGL
 */
import java.io.*;
import java.util.ArrayList;
class RECTANGL {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t--!=0) {
            String[] line = br.readLine().split(" ");
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = 0; i < line.length; i++) {
                int num = Integer.parseInt(line[i]);
                if(!al.isEmpty() && al.contains(num)){
                    al.remove(new Integer(num));
                }else al.add(num);
            }
            if(al.isEmpty()){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}