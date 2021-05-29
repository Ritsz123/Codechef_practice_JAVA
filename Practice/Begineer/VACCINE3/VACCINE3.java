package Practice.Begineer.VACCINE3;

import java.io.*;

class VACCINE3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int g = Integer.parseInt(line[0]);
            int p = Integer.parseInt(line[1]);
            int[] arr = new int[10];

            for (int i = 2; i < 12; i++) {
                arr[i - 2] = Integer.parseInt(line[i]);
            }

            int beforechef = 0;

            for (int i = g; i < arr.length; i++) {
                beforechef += arr[i];
            }

            int min = (beforechef + 1) / p;
            if ((beforechef + 1) % p != 0)
                min++;

            int max = (beforechef + arr[g]) / p;
            if ((beforechef + arr[g]) % p != 0) {
                max++;
            }

            System.out.println(min + " " + max);
        }
    }
}