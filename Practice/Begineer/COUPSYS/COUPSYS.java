package Practice.Begineer.COUPSYS;

/**
 * COUPSYS
 */
import java.io.*;
import java.util.*;

class COUPSYS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            Coupon[] arr = new Coupon[n];
            for (int i = 0; i < n; i++) {
                String[] line = br.readLine().split(" ");
                int c = Integer.parseInt(line[0]);
                int l = Integer.parseInt(line[1]);
                int x = Integer.parseInt(line[2]);
                arr[i] = new Coupon(c, l, x);
            }
            Arrays.sort(arr, new SortCoupon());
            // for (Coupon x : arr) {
            // System.out.println(x.level);
            // }
            Coupon[] ans = new Coupon[3];
            int maxDiscount = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i].level == 1 && arr[i].discount > maxDiscount) {
                    maxDiscount = arr[i].discount;
                    ans[0] = arr[i];
                }
            }
            maxDiscount = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i].level == 2 && arr[i].discount > maxDiscount) {
                    maxDiscount = arr[i].discount;
                    ans[1] = arr[i];
                }
            }
            maxDiscount = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i].level == 3 && arr[i].discount > maxDiscount) {
                    maxDiscount = arr[i].discount;
                    ans[2] = arr[i];
                }
            }
            for (Coupon c : ans) {
                System.out.println(c.discount + " " + c.city);
            }
        }
    }
}

class Coupon {
    int city;
    int level;
    int discount;

    Coupon(int i, int j, int k) {
        city = i;
        level = j;
        discount = k;
    }
}

class SortCoupon implements Comparator<Coupon> {
    @Override
    public int compare(Coupon o1, Coupon o2) {
        return o1.city - o2.city;
    }
}