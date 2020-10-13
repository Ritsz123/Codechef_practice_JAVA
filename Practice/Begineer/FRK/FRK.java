package Practice.Begineer.FRK;

import java.io.*;
import java.util.ArrayList;

class FRK {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        ArrayList<String> subs = new ArrayList<>();
        String ch = "chef";
        for (int i = 0; i < ch.length(); i++) {
            for (int j = i + 1; j < ch.length(); j++) {
                subs.add(ch.substring(i, j + 1));
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < subs.size(); j++) {
                if (arr[i].contains(subs.get(j))) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
