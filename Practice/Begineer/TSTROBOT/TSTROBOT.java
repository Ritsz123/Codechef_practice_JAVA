package Practice.Begineer.TSTROBOT;

import java.io.*;
import java.util.ArrayList;
/**
 * TSTROBOT
 */
public class TSTROBOT {

    public static void main(String[] args) throws Exception{
        // your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
		    String [] line = br.readLine().split(" ");
		    int n = Integer.parseInt(line[0]);
		    int p = Integer.parseInt(line[1]);
            int tmp=p;
            ArrayList<Integer> trav = new ArrayList<>();
            char[] s = br.readLine().toCharArray();
            trav.add(p);
            for (int i = 0; i < n; i++) {
                if (s[i]=='R') {
                    tmp++;
                }else if(s[i]=='L') tmp--;
                if(!trav.contains(tmp)) trav.add(tmp);
            }
            System.out.println(trav.size());
        }
    }
}