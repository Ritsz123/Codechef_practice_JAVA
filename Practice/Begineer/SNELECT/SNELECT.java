package Practice.Begineer.SNELECT;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * SNELECT
 */
public class SNELECT {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        while (t-->0) {
            char[] s = br.readLine().toCharArray();
            for (int i = 0; i < s.length-1; i++) {
                if(s[i]=='s' && s[i+1]=='m'){
                    s[i]='*';
                    i++;
                }else if(s[i]=='m' && s[i+1]=='s'){
                    s[i+1]='*';
                    i++;
                }
            }
            int snake=0; int mongoose=0;
            for (int i = 0; i < s.length; i++) {
                if(s[i]=='s'){
                    snake++;
                }else if(s[i]=='m'){
                    mongoose++;
                }
            }
            if(snake>mongoose) System.out.println("snakes");
            else if(snake==mongoose) System.out.println("tie");
            else if(snake<mongoose) System.out.println("mongooses");
        }
    }
}