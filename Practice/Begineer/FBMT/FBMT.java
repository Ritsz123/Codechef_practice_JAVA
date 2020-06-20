package Practice.Begineer.FBMT;

import java.io.*;
/**
 * FBMT
 */
public class FBMT {
    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            int a=0;int b=0;
            String firstTeam ="";
            String secondTeam="";
            for (int i = 0; i < n; i++) {
                String teamName = br.readLine();
                if (i==0) {
                    firstTeam=teamName;
                    a++;
                }else{
                    if (teamName.equals(firstTeam)) {
                        a++; 
                    }else{
                        secondTeam = teamName;
                        b++;
                    }    
                }
            }
            if(a==b) System.out.println("Draw");
            else {
                if(a>b) System.out.println(firstTeam);
                else System.out.println(secondTeam);
            }
        }

    }
}