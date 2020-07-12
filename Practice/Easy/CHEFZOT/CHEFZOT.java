package Practice.Easy.CHEFZOT;

/**
 * CHEFZOT
 */
import java.io.*;
class CHEFZOT {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int count=0;
        int max=-1;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(line[i]);
            if(num!=0){
                count++;
            }else{
                count=0;
            }
            if(count>max) max=count;
        }
        System.out.println(max);
    }    
}