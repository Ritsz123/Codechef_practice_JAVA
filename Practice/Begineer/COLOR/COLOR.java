package Practice.Begineer.COLOR;
import java.io.*;
class COLOR {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            char[] str = br.readLine().toCharArray();
            int R=0;int G=0;int B=0;
            for(int i=0;i<n;i++){
                if(str[i]=='R'){
                    R++;
                }else if(str[i]=='G'){
                    G++;
                }else if(str[i]=='B'){
                    B++;
                }
            }
            if(R==str.length || B==str.length || G==str.length){
                System.out.println("0");
            }else{
                int max = Math.max(Math.max(R, G), B);
                System.out.println(str.length-max);    
            }
            

        }
    }
}