import java.util.*;
import java.io.*;
class CIELRCPT {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        int arr[]={2048,1024,512,256,128,64,32,16,8,4,2,1};
        while(t-->0){
            int p =Integer.parseInt(br.readLine());
            int count=0;
            for(int i=0;i<12;i++){
                count+=(p/arr[i]);
                p=p%arr[i];
            }
            System.out.println(count);
        }
    }
}