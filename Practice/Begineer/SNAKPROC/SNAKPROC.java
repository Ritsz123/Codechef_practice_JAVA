import java.io.*;
class PLAYPIAN {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            char[] s = br.readLine().toCharArray();
            int h=0;
            boolean isValid=true;
            for(int i =0;i<n;i++){
                if(s[i]=='H'){
                    h++;
                }else if(s[i]=='T'){
                    if(h!=1){
                        isValid=false;
                        break;
                    }else
                    h--;
                }
            
            }
            if(isValid && h==0) System.out.println("Valid");
            else System.out.println("Invalid");

        }
    }
}