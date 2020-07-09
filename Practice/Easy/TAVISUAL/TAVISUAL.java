package Practice.Easy.TAVISUAL;

import java.io.*;
class TAVISUAL {

    public static void main(String[] args) throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t--!=0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int c = Integer.parseInt(line[1]);
            int q = Integer.parseInt(line[2]);
            while (q--!=0) {
                String[] line2 = br.readLine().split(" ");
                int l = Integer.parseInt(line2[0]);
                int r = Integer.parseInt(line2[1]);
                if(c>=l && c<=r){
                    int temp = c-l;
                    c = r-temp;
                }
            }
            System.out.println(c);
        }
    }
}