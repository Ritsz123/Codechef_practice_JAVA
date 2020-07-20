package Practice.Begineer.NOMATCH;

import java.io.*;
import java.util.ArrayList;

class NOMATCH {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            ArrayList<Long> al = new ArrayList<>();
            String[] line = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                Long num = Long.parseLong(line[i]);
                al.add(num);
            }
            al.sort(null);

            long sum = 0;
            for (int i = 0; i < n / 2; i++) {
                sum += al.get(i);
                sum -= al.get(al.size() - 1);
                al.remove(al.size() - 1);
            }
            System.out.println(Math.abs(sum));
        }
    }
}