package Practice.Easy.KOL15A;

/**
 * KOL15A
 */
import java.io.*;
 class KOL15A {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            char[] arr= br.readLine().toCharArray();
            int sum=0;
            for (int i = 0; i < arr.length; i++) {
                if(Character.isDigit(arr[i])){
                    sum+= (((int) arr[i])-48);
                    // System.out.println((int) arr[i]);
                }
            }
            System.out.println(sum);
        }
    }
}