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
		long testCases = Long.parseLong(sc.nextLine());
		while(testCases-->0){
		    int n = Integer.parseInt(sc.nextLine());
		    String scoreLine = sc.nextLine();
			int scoreA,scoreB;
			int rA,rB;
			rA=rB=n;
			boolean flag=false;
		    scoreA=scoreB=0;
		    for(int i=0;i<2*n;i++){
				if((scoreA-scoreB)>rB || (scoreB-scoreA)>rA){
					System.out.println(i);
					flag=true;
					break;
				}
				else{
					if(i%2==1){
						if(scoreLine.charAt(i)=='1')
							scoreA++;
							rA--;
					}
					else if(i%2==0){
						if(scoreLine.charAt(i)=='1')
							scoreB++;
							rB--;
					}
				}
			}
			if(!flag)
				System.out.println(2*n);

		}
	}
}
