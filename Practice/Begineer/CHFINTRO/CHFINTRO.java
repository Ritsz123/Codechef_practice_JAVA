package Practice.Begineer.CHFINTRO;

import java.io.*;
class CHFINTRO{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n= Integer.parseInt(line[0]);
        int r = Integer.parseInt(line[1]);
        while (n-->0) {
            int num = Integer.parseInt(br.readLine());
            if(num<r){
                System.out.println("Bad boi");
            } else { System.out.println("Good boi"); }
        }
    }
}