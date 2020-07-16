package Practice.Begineer.TLG;

/**
 * TLG
 */
import java.io.*;
public class TLG {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int scoreA,scoreB;
        scoreA=scoreB=0;
        int maxDiff=0;
        int winner=0;
        for (int i = 1; i <= t; i++) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            scoreA+=a;
            scoreB+=b;
            int diff=0;
            int tempWinner=0;
            if(scoreA>scoreB){
                diff = scoreA-scoreB;
                tempWinner=1;
            }
            if(scoreB>scoreA){
                diff=scoreB-scoreA;
                tempWinner=2;
            }
            if(diff>maxDiff){
                maxDiff=diff;
                winner = tempWinner;
            }
        }
        System.out.println(winner + " " + maxDiff);
    }
}