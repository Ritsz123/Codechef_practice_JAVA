package Practice.Begineer.CV;

import java.io.*;
import java.util.ArrayList;
/**
 * CV
 */
class CV {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        while(t-->0){
            ArrayList<Character> al = new ArrayList<>();
            al.add('a');
            al.add('e');
            al.add('i');
            al.add('o');
            al.add('u');
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine().toLowerCase();
            int count=0;
            for(int i=0;i<n-1;i++){
                if(!al.contains(s.charAt(i))){
                    if(al.contains(s.charAt(i+1)))
                    count++;
                }
            }
            System.out.println(count);

        }
    }
    
}