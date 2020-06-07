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
		int numberOfTests = Integer.parseInt(sc.nextLine());
		for(int i=1;i<=numberOfTests;i++)
		{
		    String[] line1 = sc.nextLine().split(" ");
		    String nationality=line1[1];
		    int activities = Integer.parseInt(line1[0]);

		    int totalLadoo=0;

            while(activities-->0)
            {
                String line[] = sc.nextLine().split(" ");
                if(line[0].equals("CONTEST_WON"))
                    if(20-Integer.parseInt(line[1])>=0)
                        totalLadoo+=300+ (20-Integer.parseInt(line[1]));
                    else
                        totalLadoo+=300;
                else if(line[0].equals("TOP_CONTRIBUTOR"))
                        totalLadoo+=300;
                else if(line[0].equals("BUG_FOUND"))
                        totalLadoo+= Integer.parseInt(line[1]);
                else if(line[0].equals("CONTEST_HOSTED"))
                        totalLadoo+=50;
            }
            if(nationality.equals("INDIAN"))
			    System.out.println(totalLadoo/200);
			else
		    	System.out.println(totalLadoo/400);
		}
	}
}
