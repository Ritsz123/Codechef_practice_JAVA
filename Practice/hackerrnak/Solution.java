import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int radius = sc.nextInt();
            int x= sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            checkIntersection(a, b, c, x, y, radius);
        }
    
    }

    static void checkIntersection(int a, int b, int c,int x, int y, int radius) 
    {
        double dist = (Math.abs(a * x + b * y + c)) /
                        Math.sqrt(a * a + b * b); 
      
        if (radius == dist) 
            System.out.println ( "passes through udaipur" ); 
        else if (radius > dist) 
            System.out.println( "touch udaipur") ; 
        else
            System.out.println( "doesn't passes through udaipur") ; 
    } 
}