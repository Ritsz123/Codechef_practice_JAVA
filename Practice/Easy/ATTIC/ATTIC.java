package Practice.Easy.ATTIC;

/**
 * ATTIC
 */
import java.io.*;
 class ATTIC {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t--!=0) {
            char[] arr = br.readLine().toCharArray();
            int count=0;
            int maxCount=0;
            int daysCount=0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]=='#'){
                    if(count>maxCount){
                        maxCount = count;
                        daysCount++;
                    }
                    count=0;
                }
                else{
                   count++;
                }
            }
            System.out.println(daysCount);
        }
    }
}