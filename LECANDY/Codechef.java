package LECANDY;

/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0){
            int animals = sc.nextInt();
            long totalCandiesLeft = sc.nextLong();
            long candiesused=0;
            for(int i=0;i<animals;i++){
                candiesused+=sc.nextInt();
            }
            if(candiesused<=totalCandiesLeft){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
	}
}
