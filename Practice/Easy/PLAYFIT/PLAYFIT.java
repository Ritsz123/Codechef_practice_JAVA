package Practice.Easy.PLAYFIT;

/**
 * PLAYFIT
 */
import java.io.*;

// simple approach.. 
// find maximim of (arr[i],arr[i]-minimum)
class PLAYFIT {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t--!=0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]= Integer.parseInt(line[i]);
            }
            int maxDiff=Integer.MIN_VALUE;
            int minNumber = arr[0];
            for (int i = 1; i < n; i++) {
                minNumber = Math.min(minNumber, arr[i]);
                maxDiff = Math.max(maxDiff, arr[i]-minNumber);
            }
            if(maxDiff>0)
            System.out.println(maxDiff);
            else System.out.println("UNFIT");
        }
    }
}