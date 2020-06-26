package Practice.Begineer.COVID19;

/**
 * COVID19
 */
import java.io.*;
import java.util.ArrayList;
class COVID19 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int[] arr= new int[n];
            for (int i = 0; i < line.length; i++) {
                arr[i]=Integer.parseInt(line[i]);
            }
            ArrayList<Integer> count = new ArrayList<>();
            int tmp=1;
            for (int i = 0; i < arr.length-1; i++) {
                if((arr[i+1]-arr[i])<=2){
                    tmp++;
                }else{
                    count.add(tmp);
                    tmp=1;
                }
            }
            count.add(tmp);
            count.sort(null);
            System.out.println(count.get(0) + " " + count.get(count.size()-1));
        }
    }
}