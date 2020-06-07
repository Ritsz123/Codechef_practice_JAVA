/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechefg
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++){
		    int count=0;
		    int n = sc.nextInt();
		    int cars[] = new int[n];
		    for(int j=0;j<n;j++){
		        if(sc.hasNextInt())
		            cars[j]=sc.nextInt();
		    }
		    for(int j=1;j<n;j++){
		        if(cars[j]>cars[j-1])
		        {
					cars[j]=cars[j-1];
		        	count++;
				}
		    }
		    System.out.println(n-count);
		    }
		}
	}
