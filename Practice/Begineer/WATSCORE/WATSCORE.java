package Practice.Begineer.WATSCORE;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * WATSCORE
 */
class WATSCORE {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            int [] scores = new int[8];
            for (int i = 0; i < n; i++) {
                String[] line = br.readLine().split(" ");
                int index = Integer.parseInt(line[0]);
                int score = Integer.parseInt(line[1]);
                if(index<9){
                    if (score>scores[index-1]) {
                        scores[index-1] = score;
                    }
                }
            }
            int totalScore=0;
            for (int i = 0; i < scores.length; i++) {
                totalScore+=scores[i];
            }
            System.out.println(totalScore);
        }
    }
}