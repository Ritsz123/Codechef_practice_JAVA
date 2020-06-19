package Practice.Begineer.NW1;

import java.io.*;
/**
 * NW1
 */
class NW1 {

    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String [] line = br.readLine().split(" ");
            int totalDays = Integer.parseInt(line[0]);
            String start = line[1];
            int [] days = new int[7];
            for (int i = 0; i < days.length; i++) {
                days[i]=4;
            }
            for (int i = getStartDay(start); totalDays!=28; i=i++%7,totalDays--) {
                i=i%7;
                days[i]=days[i]+1;
            }
            for (int i = 0; i < days.length; i++) {
                System.out.print(days[i] + " ");
            }
            System.out.println();
        }
    }
    static int getStartDay(String s){
        switch (s) {
            case "mon":
            return 0;
            case "tues":
            return 1;
            case "wed":
            return 2;
            case "thurs":
            return 3;
            case "fri":
            return 4;
            case "sat":
            return 5;
            case "sun":
            return 6;
            default:
            return -1;
        }
    }
}