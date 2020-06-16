package Practice.Begineer.FRUITS;

import java.io.*;
class FRUITS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] line = br.readLine().split(" ");
            int apple = Integer.parseInt(line[0]);
            int orange = Integer.parseInt(line[1]);
            int coins = Integer.parseInt(line[2]);
            int d = Math.abs(apple-orange);
            if(d<coins){
                System.out.println("0");
            }else
                System.out.println(coins-d);
        }
    }
}