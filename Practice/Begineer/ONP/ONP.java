package Practice.Begineer.ONP;

import java.io.*;
import java.util.*;

class ONP {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String str = br.readLine();
            String postfix = "";
            Stack<Character> stack = new Stack<>();
            for(int i=0;i<str.length();i++){
                char c = str.charAt(i);
                if(c=='('){
                    stack.push(c);
                }else 
                if(c==')'){
                    while(!stack.isEmpty() && stack.peek()!='('){
                        postfix+=stack.pop();
                    }
                    if(!stack.isEmpty() && stack.peek()=='(')
                        stack.pop();
                }
                else if(c=='+' || c=='-' || c=='*' || c=='/' || c=='^'){
                    if(!stack.isEmpty()){
                        if(prec(stack.peek())>=prec(c)){
                            postfix+=stack.pop();
                        }
                    }
                    stack.push(c);
                }else{
                    postfix+=c;
                }
            }
            if(!stack.isEmpty()){
                while(!stack.isEmpty()){
                    postfix+=stack.pop();
                }
            }
            System.out.println(postfix);
        }
    }
    static int prec(char c){
        switch(c){
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2; 
            case '^': return 3; 
            default: return -1;
        }
    }
}