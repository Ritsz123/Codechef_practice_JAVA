package Practice.Begineer.VILTRIBE;

/**
 * VILTRIBE
 */
import java.io.*;
public class VILTRIBE {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            char[] str = br.readLine().toCharArray();
            int aCount=0; int bCount=0;
            int tmp=0;
            char ch='x';
            for (int i = 0; i < str.length; i++) {
                if(str[i]=='A'){
                    aCount++;
                    if(ch=='A'){
                        aCount+=tmp;
                        tmp=0;
                    }else{
                        ch='A';
                        tmp=0;
                    } 
                }else if(str[i]=='B'){
                    bCount++;
                    if(ch=='B'){
                        bCount+=tmp;
                        tmp=0;
                    }else{
                        ch='B';
                        tmp=0;
                    }
                }else
                if(str[i]=='.'){
                    tmp++;
                }
            }
            System.out.println(aCount + " " + bCount);
        }
    }
}