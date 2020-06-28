package Practice.Easy.CLEANUP;

/**
 * CLEANUP
 */
import java.io.*;
import java.util.ArrayList;
public class CLEANUP {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);
            String[] line2 =br.readLine().split(" ");
            ArrayList<Integer> mList = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                mList.add(Integer.parseInt(line2[i]));
            }
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if(!mList.contains(new Integer(i))){
                    al.add(i);
                }
            }
            String s1="";
            String s2="";
            for (int i = 0; i < al.size();i++) {
                int index = al.get(i)+1;
                if(i%2==0){
                    s1+=index+" ";
                }else s2+=index+" ";
            }
            System.out.println(s1);
            System.out.println(s2);
        }
    }
}