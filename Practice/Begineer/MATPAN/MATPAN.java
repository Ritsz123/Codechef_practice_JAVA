package Practice.Begineer.MATPAN;
import java.io.*;
import java.util.ArrayList;
/**
 * MATPAN
 */
public class MATPAN {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] prices = br.readLine().split(" ");
            char[] s = br.readLine().toCharArray();
            ArrayList<Character> usedChars = new ArrayList<>();
            ArrayList<Character> unUsed = new ArrayList<>();
            for (int i = 0; i < s.length; i++) {
                if (usedChars.isEmpty()) {
                    usedChars.add(s[i]);
                }else{
                    if (!usedChars.contains(s[i])){
                        usedChars.add(s[i]);
                    }
                }
            }
            for (char i = 'a'; i <= 'z'; i++) {
                if(!usedChars.contains(i)) {
                    unUsed.add(i);
                }
            }
            int totalCost=0;
            for (int i = 0; i < unUsed.size(); i++) {
                int pos = (int)unUsed.get(i) - 97;
                totalCost+=Integer.parseInt(prices[pos]);
            }
            System.out.println(totalCost);
        }
    }
}