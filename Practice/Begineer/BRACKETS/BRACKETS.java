package Practice.Begineer.BRACKETS;

import java.io.*;
class BRACKETS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t-->0){
            String s = br.readLine();
            String r="";
            int balance=0;
            int maxbalance=0;
            int l = s.length();
            for(int i=0;i<l;i++){
                if(s.charAt(i)=='(')
                balance++;
                else if(s.charAt(i)==')')
                balance--;

                maxbalance = balance>maxbalance?balance:maxbalance;
            }
            for(int i=0;i<maxbalance;i++){
                System.out.print('(');
            }
            for(int i=0;i<maxbalance;i++){
               System.out.print(')');
            }
            System.out.println();
        }
    }
}