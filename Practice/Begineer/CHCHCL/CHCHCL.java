package Practice.Begineer.CHCHCL;

/* package codechef; // don't place package name! */

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
		    String[] line = br.readLine().split(" ");
		    long a = Long.parseLong(line[0]);
		    long b= Long.parseLong(line[1]);
		    long res = a*b;
		    if((res-1)%2==1){
		        System.out.println("Yes");
		    }
		    else System.out.println("No");
		}
		
	}
}
