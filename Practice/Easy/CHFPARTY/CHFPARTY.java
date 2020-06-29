/* package codechef; // don't place package name! */

import java.util.*;
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
		    int n = Integer.parseInt(br.readLine());
		    String[] line = br.readLine().split(" ");
		    int total=0;
		    int[] arr = new int[n];
		    for (int i=0;i<n;i++ ){
		       arr[i] = Integer.parseInt(line[i]);
		    } 
		    Arrays.sort(arr);
		    for (int i=0;i<n ;i++){
		        if(total>=arr[i]){
		            total++;
		        }
		    } 
		    System.out.println(total);
		}
	}
}
