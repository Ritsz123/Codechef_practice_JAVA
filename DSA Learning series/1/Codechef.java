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
		int numberOfTests = sc.nextInt();
		for(int i=1;i<=numberOfTests;i++){
		    long num = sc.nextLong();
		    int count=0;
		    while(num!=0){
		        num = num/5;
		        count+=num;
		    }
		    System.out.println(count);
		}
	}
}
