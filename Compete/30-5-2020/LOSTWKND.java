import java.util.*;
import java.io.*;
class LOSTWKND {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int totalTime = 5 * 24;
        while(t-->0){
            String[] line = br.readLine().split(" ");
            int time =0;
            for(int i=0;i<line.length-1;i++){
                time+=Integer.parseInt(line[i]);
            }
            time = time * Integer.parseInt(line[line.length-1]);
            if(time>totalTime){
                System.out.println("Yes");
            }else
            System.out.println("No");
        }
    }
}