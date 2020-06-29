package Practice.Easy.TACHSTCK;

/**
 * TACHSTCK
 */
import java.io.*;
import java.util.Arrays;
class TACHSTCK {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        long d = Long.parseLong(line[1]);
        long [] arr =new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Long.parseLong(br.readLine());
        }
        Arrays.sort(arr);
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                count++;
            }else if((arr[i]+2)==arr[i]) count++;
            else if((arr[i]+1)==arr[i]) count++;
        }
        System.out.println(count);
    }    
}