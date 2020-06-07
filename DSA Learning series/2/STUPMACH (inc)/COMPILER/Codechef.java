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
            Stack<Character> stack = new Stack<Character>();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='<')
                    stack.push(str.charAt(i));
                else if(str.charAt(i)=='>')
                    c = stack.pop();
            }    
		}
    }


    static char pop(){

    }
}
