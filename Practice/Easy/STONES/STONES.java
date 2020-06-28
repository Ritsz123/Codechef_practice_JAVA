package Practice.Easy.STONES;

/**
 * STONES
 */
import java.io.*;
import java.util.ArrayList;
 class STONES {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            char[] j = br.readLine().toCharArray();
            ArrayList<Character> al = new ArrayList<>();
            for (int i = 0; i < j.length; i++) {
                al.add(j[i]);
            }
            char[] s = br.readLine().toCharArray();
            int count=0;
            for (int i = 0; i < s.length; i++) {
                if(al.contains(s[i])){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}