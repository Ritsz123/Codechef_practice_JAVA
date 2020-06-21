

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * CHEFDETE
 */
public class CHEFDETE {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            al.add(i);
        }
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(line[i]);
            if(al.contains(tmp)){
                al.remove(new Integer(tmp));
            }
        }
        for (int i = 0; i < al.size();i++) {
            System.out.print(al.get(i)+ " ");
        }
        System.out.println();
    }
}