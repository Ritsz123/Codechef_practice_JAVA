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
		int testCases = Integer.parseInt(sc.nextLine());
		while(testCases-->0){
			String str = sc.nextLine();
			int open,close,index;
			open=close=index=0;
			for(int i =0;i<str.length();i++){
				char ch = str.charAt(i);
				if(ch=='<'){
					open++;
				}else{
					close++;
				}
				if(open==close){
					index=i+1;
				}
				if(close>open){
					break;
				}
			}
			System.out.println(index);
		}
    }
}
