package Practice.Begineer.COLGLF2;

/**
 * COLGLF2
 */
import java.io.*;
import java.util.ArrayList;

class COLGLF2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int seasons = Integer.parseInt(br.readLine());
            int[] intro = new int[seasons];
            String[] line = br.readLine().split(" ");
            for (int i = 0; i < seasons; i++) {
                intro[i] = Integer.parseInt(line[i]);
            }
            ArrayList<ArrayList<Integer>> episodes = new ArrayList<>();
            for (int i = 0; i < seasons; i++) {
                line = br.readLine().split(" ");
                int n = Integer.parseInt(line[0]);
                ArrayList<Integer> al = new ArrayList<>();
                for (int j = 1; j <= n; j++) {
                    if (j == 1) {
                        al.add(Integer.parseInt(line[j]));
                    } else {
                        al.add(Integer.parseInt(line[j]) - intro[i]);
                    }
                }
                episodes.add(al);
            }

            int time = 0;
            for (int i = 0; i < seasons; i++) {
                ArrayList<Integer> al = episodes.get(i);
                for (int j = 0; j < al.size(); j++) {
                    time += al.get(j);
                }
            }
            System.out.println(time);
        }
    }
}
