

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		while(testCases-->0){
		    long n= Long.parseLong(sc.nextLine());
			long min = Integer.MAX_VALUE;
			long sum=0;
		    while(n-->0){
				long t =sc.nextLong();
				if(t<min){
					min=t;
				}
				sum+=min;
			}
		    System.out.println(sum);
		}
	}
}
