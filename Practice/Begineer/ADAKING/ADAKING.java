package Practice.Begineer.ADAKING;

/**
 * ADAKING
 */
import java.io.*;
class ADAKING {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t--!=0) {
            int n = Integer.parseInt(br.readLine());
            char[][] arr = new char[8][8];
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if(i==0 && j==0){
                        arr[i][j]='O';
                        n--;
                    }else if(n!=0){
                        arr[i][j]='.';
                        n--;
                    }else arr[i][j]='X';
                }
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.println(new String(arr[i]));
            }
            System.out.println();
        }
    }
}