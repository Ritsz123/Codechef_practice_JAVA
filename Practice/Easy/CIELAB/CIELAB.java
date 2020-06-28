package Practice.Easy.CIELAB;

import java.io.*;
/**
 * CIELAB
 */
 class CIELAB {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int res = a-b;
        if(res%10!=9) 
        res++;
        else res--;
        System.out.println(res);
    }
}