package Practice.Begineer.EXAM1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * EXAM1
 */
class EXAM1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String correct = br.readLine();
            String ans = br.readLine();
            int score=0;
            for (int i = 0; i < n; i++) {
                if(ans.charAt(i)!='N'){
                    if(correct.charAt(i)==ans.charAt(i)){
                        score++;
                    }else{
                        i++;
                    }
                }
            }
            System.out.println(score);
        }
    }
    
}