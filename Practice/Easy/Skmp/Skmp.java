package Practice.Easy.Skmp;

import java.io.*;
import java.util.*;

class Skmp {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            char[] s = br.readLine().toCharArray();
            char[] p = br.readLine().toCharArray();

            Arrays.sort(s);
            HashMap<Character, Integer> map = new HashMap<>();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length; i++) {
                if (map.containsKey(s[i]))
                    map.put(s[i], map.get(s[i]) + 1);
                else
                    map.put(s[i], 1);
            }
            for (int i = 0; i < p.length; i++) {
                map.put(p[i], map.get(p[i]) - 1);
            }
            String ans = "";
            boolean added = false;
            for (char i = 'a'; i <= 'z'; i++) {
                if (map.containsKey(i)) {
                    int times = map.get(i);
                    if (i < p[0]) {
                        for (int j = 1; j <= times; j++) {
                            sb.append(i);
                        }
                    } else if (i == p[0]) {
                        for (int j = 0; j < p.length; j++) {
                            if (i == p[j]) {
                                continue;
                            } else if (i < p[j]) {
                                for (int k = 1; k <= times; k++) {
                                    sb.append(i);
                                }
                                if (!added) {
                                    ans += sb.append(new String(p));
                                    added = true;
                                }
                                break;
                            } else if (i > p[j]) {
                                if (!added) {
                                    ans += sb.append(new String(p));
                                    added = true;
                                }
                                for (int k = 1; k <= times; k++) {
                                    sb.append(i);
                                }
                                break;
                            }
                        }
                    } else {
                        for (int j = 1; j <= times; j++) {
                            sb.append(i);
                        }
                    }
                }
            }
            ans = sb.toString();
            System.out.println(ans);
        }

    }

}
