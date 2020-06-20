package Practice.Begineer.BIT2A;

import java.io.*;
/**
 * BIT2A
 */
public class BIT2A {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            int[] oldList = new int[n];
            int[] newList = new int[n];
            String[] line = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                oldList[i] = Integer.parseInt(line[i]);
            }
            for (int i = 0; i < n; i++) {
                newList[i]=countGreater(oldList, i);
            }
            for (int i = 0; i < newList.length; i++) {
                System.out.print(newList[i] + " ");
            }
            System.out.println();
        }
    }
    static int countGreater(int[] a,int i){
        int c =0;
        for (int j = i; j < a.length; j++) {
            if(a[j]>a[i]) c++;
        }
        return c;
    }
    
}