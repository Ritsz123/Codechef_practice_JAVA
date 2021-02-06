package Practice.Begineer.MEET;

/**
 * MEET
 */
import java.io.*;

class MEET {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            char[] p = br.readLine().toCharArray();
            int meetingTime = 0;
            String hrs = "" + p[0] + p[1];
            String min = "" + p[3] + p[4];
            if (p[p.length - 2] == 'A') {
                if (hrs.equals("12")) {
                    meetingTime = 0;
                } else {
                    meetingTime += Integer.parseInt(hrs);
                }
            } else {
                meetingTime += Integer.parseInt(hrs);
                if (!hrs.equals("12")) {
                    meetingTime += 12;
                }
            }
            meetingTime = meetingTime * 100 + Integer.parseInt(min);
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            int[] dep = new int[n];
            for (int i = 0; i < n; i++) {
                char[] line = br.readLine().toCharArray();
                hrs = "" + line[0] + line[1];
                min = "" + line[3] + line[4];
                int arrTime = 0;
                int depTime = 0;
                if (line[6] == 'A') {
                    if (hrs.equals("12")) {
                        arrTime = 0;
                    } else {
                        arrTime += Integer.parseInt(hrs);
                    }
                } else {
                    arrTime += Integer.parseInt(hrs);
                    if (!hrs.equals("12")) {
                        arrTime += 12;
                    }
                }
                arrTime = arrTime * 100 + Integer.parseInt(min);

                arr[i] = arrTime;

                hrs = "" + line[9] + line[10];
                min = "" + line[12] + line[13];

                if (line[15] == 'A') {
                    if (hrs.equals("12")) {
                        depTime = 0;
                    } else {
                        depTime += Integer.parseInt(hrs);
                    }
                } else {
                    depTime += Integer.parseInt(hrs);
                    if (!hrs.equals("12")) {
                        depTime += 12;
                    }
                }
                depTime = depTime * 100 + Integer.parseInt(min);

                dep[i] = depTime;
            }

            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                if (arr[i] <= meetingTime && dep[i] >= meetingTime) {
                    ans[i] = 1;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i]);
            }
            System.out.println();
        }
    }
}
