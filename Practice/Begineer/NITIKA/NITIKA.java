package Practice.Begineer.NITIKA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * NITIKA
 */
class NITIKA {

    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] line = br.readLine().split(" ");
            if (line.length==1) {
               System.out.println(capatilize(line[0]));
            }else{
                String f="";
                if (line.length==2) {
                    f = trimWord(capatilize(line[0])) + " " + capatilize(line[1]);
                }else if(line.length==3){
                    f = trimWord(capatilize(line[0])) + " " + trimWord(capatilize(line[1])) + " " + capatilize(line[2]);
                }
                System.out.println(f);
            }
        }
    }
    static String capatilize(String s){
        char[] l =s.toLowerCase().toCharArray();
        l[0] = Character.toUpperCase(l[0]);
        return new String(l);
    }
    static String trimWord(String s){
        return s.substring(0,1)+'.';
    }
}