package Practice.Begineer.SUMTRIAN;

/**
 * SUMTRIAN
 */

// use bottom up Dynamic Programming approach
// use a n * n matrix to store the triangle
// now for each i-1 check for max of [i][j] & [i][j+1] and add & store it to [i-1][j]'s value 

import java.util.*;

class SUMTRIAN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j <= i - 1; j++) {
                    arr[i - 1][j] = arr[i - 1][j] + Math.max(arr[i][j], arr[i][j + 1]);
                }
            }
            System.out.println(arr[0][0]);
            // for(int i=0;i<n;i++) {
            // for(int j=0;j<n;j++) {
            // System.out.print(arr[i][j] + " ");
            // }
            // System.out.println();
            // }
        }
    }
}
