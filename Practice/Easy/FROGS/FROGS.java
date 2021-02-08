package Practice.Easy.FROGS;

/**
 * FROGS
 */
import java.io.*;
import java.util.*;

class Frog {
    int weight;
    int skip;
    int pos;
    int id;
    int hit;

    public Frog(int weight, int skip, int pos, int id) {
        this.weight = weight;
        this.skip = skip;
        this.pos = pos;
        this.id = id;
    }
}

class FROGS implements Comparator<Frog> {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            int[] weights = new int[n];
            String[] line = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                weights[i] = Integer.parseInt(line[i]);
            }

            int[] skips = new int[n];
            line = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                skips[i] = Integer.parseInt(line[i]);
            }

            Frog[] arr = new Frog[n];
            for (int i = 0; i < n; i++) {
                arr[i] = new Frog(weights[i], skips[i], i, i + 1);
            }

            int c = 0;

            Arrays.sort(arr, new FROGS());

            for (int i = n - 2; i >= 0; i--) {
                for (int j = i; j < n; j++) {
                    while (arr[i].id != arr[j].id && arr[i].pos <= arr[j].pos && arr[i].weight >= arr[j].weight) {
                        arr[i].pos = arr[i].pos + arr[i].skip;
                        arr[i].hit++;
                        c++;
                    }
                }
            }
            // for (Frog f: arr) {
            // System.out.println(f);
            // }
            System.out.println(c);
        }
    }

    @Override
    public int compare(Frog t1, Frog t2) {
        return t2.weight - t1.weight;
    }
}
