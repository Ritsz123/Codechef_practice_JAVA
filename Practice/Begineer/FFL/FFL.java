package Practice.Begineer.FFL;

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		
		for(int m=0;m<t;m++)
		{
		    int n=input.nextInt();
		    int s=input.nextInt();
		    int[] p=new int[n];
		    int[] arr=new int[n];
		    int sum=100-s;
		    int min=100,min1=100;
		    for(int i=0;i<n;i++)
		    p[i]=input.nextInt();
		    for(int i=0;i<n;i++)
		    arr[i]=input.nextInt();
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]==0)
		         {   
		            if(p[i]<min)
		            min=p[i];
		             
		         }
		         else if(arr[i]==1)
		         {  
		             if(p[i]<min1)
		             min1=p[i];
		         }
		    }
		    if(min+min1<=sum)
		    System.out.println("yes");
		    else
		    System.out.println("no");
		}
	}
}
