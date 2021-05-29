package Practice.Begineer.TRISQ;

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            n = n - 2; // always need
            n = n / 2; // number of squares

            System.out.println(n * (n + 1) / 2);
        }
    }
}
