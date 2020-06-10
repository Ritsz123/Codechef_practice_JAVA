package Practice.Begineer.URCALC;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class URCALC {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        char c = (char)br.read();

        switch(c){
            case '+': System.out.println(a+b); break;
            case '-':System.out.println(a-b); break;
            case '*': System.out.println(a*b); break;
            case '/':System.out.println((double)a/b); break;

        }
    }    
}