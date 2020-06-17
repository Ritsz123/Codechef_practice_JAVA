package Practice.Begineer.EGRANDR;

import java.io.*;
import java.util.Arrays;
class EGRANDR {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int [] marks = new int[n];
            int sum=0;
            for (int i = 0; i < n; i++) {
                marks[i]=Integer.parseInt(line[i]);
                sum+=marks[i];
            }
            Arrays.sort(marks);
            int maxGrade = marks[n-1];
            int minGrade = marks[0];
            double avg = sum/n;
            if(maxGrade==5 && minGrade!=2 && avg>=4.0){
                System.out.println("Yes");
            }else System.out.println("No");
        }
    }
    
}