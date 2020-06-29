package Practice.Easy.NUM239;

import java.io.*;
class NUM239 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            int count=0;
            for (int i = a; i <= b; i++) {
                int n = i%10;
                if(n==2 || n==3|| n==9){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}