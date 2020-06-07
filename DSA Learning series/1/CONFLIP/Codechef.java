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
		long testcases = sc.nextLong();
		for(long i=1;i<=testcases;i++)
		{
		    int numberOfGames = sc.nextInt();
		    for(int j=1;j<=numberOfGames;j++)
		    {

		        int initial = sc.nextInt();
		        int numberOfCoins = sc.nextInt();
		        int toGuess = sc.nextInt();
		        int count=0;

				//if you have to guess initial OR
				// ANY in case where numberofcoins is EVEN then both head and tail are EQUAL i.e n/2
		      	if(toGuess==initial || numberOfCoins%2==0){
					count= numberOfCoins/2;
				}else if(toGuess!=initial)
					count = (numberOfCoins/2)+ 1;
				System.out.println(count);
		    }
		}
	}
}
