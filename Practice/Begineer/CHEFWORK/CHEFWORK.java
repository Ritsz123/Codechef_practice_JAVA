package Practice.Begineer.CHEFWORK;

/**
 * CHEFWORK
 */
import java.io.*;
public class CHEFWORK {

    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        String[] line2 = br.readLine().split(" ");
        int min1=Integer.MAX_VALUE;int min2=Integer.MAX_VALUE;int min3=Integer.MAX_VALUE;
        for (int i = 0; i < line.length; i++) {
            int ch=Integer.parseInt(line2[i]);
            int num = Integer.parseInt(line[i]);
            switch(ch){
                case 1: if(num<min1) min1=num; break;
                case 2: if(num<min2) min2 = num; break;
                case 3: if(num<min3) min3 = num; break;
            }
        }
        // System.out.println(min1 + " " + min2 + " " + min3);
        if(min1!=Integer.MAX_VALUE && min2!=Integer.MAX_VALUE && (min1+min2)>min3) System.out.println(min3);
        else System.out.println(min1+min2);
    }
}