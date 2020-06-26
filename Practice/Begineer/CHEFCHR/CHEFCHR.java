package Practice.Begineer.CHEFCHR;

/**
 * CHEFCHR
 */
import java.io.*;
class CHEFCHR {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            char[] line=  br.readLine().toCharArray();
            int mainCount=0;
            boolean isGood =false;
            for (int i = 0; i < line.length-3; i++) {
                if(line[i]=='c' || line[i]=='h' || line[i]=='e' || line[i]=='f'){
                    if((line[i+1]!=line[i]) && (line[i+1]=='c' || line[i+1]=='h' || line[i+1]=='e' || line[i+1]=='f')){
                        if((line[i+2]!=line[i] && line[i+2]!=line[i+1]) && (line[i+2]=='c' || line[i+2]=='h' || line[i+2]=='e' || line[i+2]=='f')){
                            if((line[i+3]!=line[i] && line[i+3]!=line[i+1] && line[i+3]!=line[i+2]) && (line[i+3]=='c' || line[i+3]=='h' || line[i+3]=='e' || line[i+3]=='f')){
                                isGood=true;
                                mainCount++;
                            }
                        }
                    }
                }
            }
            if(isGood){
                System.out.println("lovely" + " " + mainCount);
            }else System.out.println("normal");
        }
    }
}