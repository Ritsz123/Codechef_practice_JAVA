package Practice.Easy.THREE;

import java.util.*;

class THREE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            char[] arr = sc.next().toCharArray();
            HashMap<Character, Integer> hm = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                if (hm.containsKey(arr[i])) {
                    hm.put(arr[i], hm.get(arr[i]) + 1);
                } else {
                    hm.put(arr[i], 1);
                }
            }
            int twos = 0;
            int x = arr.length / 3;
            for (int i = 0; i < arr.length; i++) {
                if (hm.containsKey(arr[i])) {
                    int num = hm.get(arr[i]);
                    if (num > 0) {
                        twos += num / 2;
                    }
                    hm.remove(arr[i]);
                }
            }
            int ans = Math.min(twos, x);
            System.out.println(ans);
        }
    }

}