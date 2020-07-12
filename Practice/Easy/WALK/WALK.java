package Practice.Easy.WALK;

/**
 * WALK
 */
import java.io.*;
class WALK {

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t--!=0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < line.length; i++) {
                int num = Integer.parseInt(line[i]);
                if(num+i>max){
                    max = num+i;
                }
            }
            System.out.println(max);
        }
    }
}