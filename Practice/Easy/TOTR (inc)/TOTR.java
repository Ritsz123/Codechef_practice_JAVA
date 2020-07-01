

/**
 * TOTR
 */
import java.io.*;
import java.util.HashMap;

public class TOTR {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int t = Integer.parseInt(line[0]);
        char[] sec = line[1].toCharArray();

        HashMap<Character,Character> set = new HashMap<>();
        int i=0;
        for(char c='a'; c<='z'; c++,i++){
            set.put(c, sec[i]);
        }
        while (t-->0) {
            char[] str = br.readLine().toCharArray();
            for (int j = 0; j < str.length; j++) {
                char ch = str[j];
                if(Character.isUpperCase(ch)){
                    ch = Character.toLowerCase(ch);
                    if(!set.containsKey(ch)){
                        if(ch=='_'){
                            str[j]=' ';
                        }else j++;
                    }
                    str[j]= Character.toUpperCase(set.get(ch));    
                }else{
                    if(!set.containsKey(ch)){
                        if(ch=='_'){
                            str[j]=' ';
                        }else j++;
                    }else
                    str[j]=set.get(ch);
                }
            }
            System.out.println(new String(str));
        }
    }
}