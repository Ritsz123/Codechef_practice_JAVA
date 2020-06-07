/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int textcases = Integer.parseInt(br.readLine());
        while(textcases-->0){
            int len = Integer.parseInt(br.readLine());
            String exp = br.readLine();
            String result ="";
            Stack<Character> stack = new Stack<Character>();
            for(int i=0;i<exp.length();i++){
                char c=exp.charAt(i);
                if(c=='('){
                    stack.push(c);
                }else
                if(c==')'){
                    while(!stack.isEmpty() && stack.peek()!='('){
                        result+=stack.pop();
                    }
                    if(!stack.isEmpty() && stack.peek()=='('){
                        stack.pop();
                    }
                }else
                if(c=='+' || c=='-' || c=='*' || c=='/' || c=='^'){
                    if(!stack.isEmpty()){
                        if(priority(stack.peek())>=priority(c)){
                            result+=stack.pop();
                        }
                    }
                    stack.push(c);
                }else{
                    result+=c;
                }
            }
            if(!stack.isEmpty()){
                while(!stack.isEmpty()){
                    result+=stack.pop();
                }
            }
            System.out.println(result);
        }
    }
    static int priority(char ch){
        switch(ch){
            case '+':
            case '-': return 1;
            case '*': 
            case '/': return 2;
            case '^': return 3;
            default: return -1;
        }
    }
}
