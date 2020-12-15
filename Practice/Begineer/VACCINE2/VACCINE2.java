package Practice.Begineer.VACCINE2;

import java.util.Scanner;

class VACCINE2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int riskCount = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] >= 80 || arr[i] <= 9) {
                    riskCount++;
                }
            }
            int nonRisk = n - riskCount;
            int days = 0;
            if (riskCount != 0) {
                if (riskCount >= d) {
                    if (riskCount % d != 0) {
                        days += 1;
                    }
                    days += riskCount / d;
                } else {
                    days++;
                }
            }
            if (nonRisk != 0) {
                if (nonRisk >= d) {
                    if (nonRisk % d != 0) {
                        days += 1;
                    }
                    days += nonRisk / d;
                } else {
                    days++;
                }
            }
            System.out.println(days);
        }
    }
}