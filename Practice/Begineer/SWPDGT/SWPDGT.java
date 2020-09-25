package Practice.Begineer.SWPDGT;

/**
 * SWPDGT
 */
import java.io.*;

class SWPDGT {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            char[] maxNum = Integer.toString(Math.max(a, b)).toCharArray();
            char[] minNum = Integer.toString(Math.min(a, b)).toCharArray();
            int sum = a + b;
            for (int i = 0; i < maxNum.length; i++) {
                for (int j = 0; j < minNum.length; j++) {
                    int min = Integer.parseInt(Character.toString(minNum[j]));
                    int max = Integer.parseInt(Character.toString(maxNum[i]));
                    if (i == 0) {
                        if (max < min) {
                            char tm = minNum[j];
                            minNum[j] = maxNum[i];
                            maxNum[i] = tm;
                            int num = Integer.parseInt(new String(maxNum)) + Integer.parseInt(new String(minNum));
                            if (num >= sum) {
                                sum = num;
                            }
                            tm = minNum[j];
                            minNum[j] = maxNum[i];
                            maxNum[i] = tm;
                        }
                    } else {
                        if (max > min) {
                            char tm = minNum[j];
                            minNum[j] = maxNum[i];
                            maxNum[i] = tm;
                            int num = Integer.parseInt(new String(maxNum)) + Integer.parseInt(new String(minNum));
                            if (num >= sum) {
                                sum = num;
                            }
                            tm = minNum[j];
                            minNum[j] = maxNum[i];
                            maxNum[i] = tm;
                        }
                    }
                }
            }
            System.out.println(sum);
        }
    }
}