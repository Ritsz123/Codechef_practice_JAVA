package Practice.Begineer.EVENPSUM;

import java.util.Scanner;

class EVENPSUM {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long count = 0;
            if (a % 2 == 1 && b % 2 == 1) {
                count = ((a * b) + 1) / 2;
            } else {
                count = (a * b) / 2;
            }
            System.out.println(count);
        }
    }
}