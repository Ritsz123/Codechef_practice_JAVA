package Practice.Begineer.SMPAIR;

import java.util.Arrays;
import java.util.Scanner;

class SMPAIR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] nos = new int[n];
            for(int i=0;i<n;i++){
                nos[i]=sc.nextInt();
            }
            Arrays.sort(nos);
            System.out.println(nos[0]+nos[1]);
        }
    }    
}