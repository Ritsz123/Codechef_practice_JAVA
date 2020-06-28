package Practice.Easy.ERROR;
import java.io.*;

/**
 * ERROR
 */
 class ERROR {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String line= br.readLine();
            if(line.contains("010")|| line.contains("101"))
            System.out.println("Good");
            else System.out.println("Bad");
        }
    }
}