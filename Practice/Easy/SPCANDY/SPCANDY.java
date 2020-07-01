
package Practice.Easy.SPCANDY;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * SPCANDY
 */
class SPCANDY {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-->0) {
            String[] line = br.readLine().trim().split(" ");
            long candies = Long.parseLong(line[0]);
            long stud = Long.parseLong(line[line.length-1]);
            long sCandies;
            long tCandies;
            if(stud!=0){
                sCandies = candies/stud;
                tCandies = candies%stud;
            }else{
                sCandies=0;
                tCandies=candies;
            }
            System.out.println(sCandies + " " + tCandies);
        }
    }
}