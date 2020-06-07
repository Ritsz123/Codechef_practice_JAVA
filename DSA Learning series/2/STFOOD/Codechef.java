/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		while(testCases-->0){
		    int trial = Integer.parseInt(sc.nextLine());
		    int[] profit = new int[trial];
		    for(int i=0;i<trial;i++){
		        String[] line = sc.nextLine().split(" ");
		        int [] shop = new int[3]; //si,vi,pi
		        for(int j=0;j<3;j++)
		        shop[j] = Integer.parseInt(line[j]);

		        profit[i]= shop[1]/(shop[0]+1)* shop[2];

		    }
		    Arrays.sort(profit);
		    System.out.println(profit[profit.length-1]);
		}
	}
}
