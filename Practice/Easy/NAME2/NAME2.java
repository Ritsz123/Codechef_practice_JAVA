package Practice.Easy.NAME2;

import java.io.*;

class Name2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            char[] a = line[0].toCharArray();
            char[] b = line[1].toCharArray();
            char[] x, y;
            if (a.length < b.length) {
                x = a;
                y = b;
            } else {
                x = b;
                y = a;
            }
            int i = 0;
            int j = 0;
            while (i < x.length && j < y.length) {
                if (x[i] != y[j]) {
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
            if (i == x.length) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}
