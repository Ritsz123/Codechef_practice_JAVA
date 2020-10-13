package Practice.Begineer.CHRL2;

import java.io.*;

class CHRL2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int c, ch, che, chef;
        c = ch = che = chef = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'C') {
                c++;
            } else if (arr[i] == 'H') {
                if (c > 0) {
                    c--;
                    ch++;
                }
            } else if (arr[i] == 'E') {
                if (ch > 0) {
                    ch--;
                    che++;
                }
            } else if (arr[i] == 'F') {
                if (che > 0) {
                    che--;
                    chef++;
                }
            }
        }
        System.out.println(chef);
    }
}