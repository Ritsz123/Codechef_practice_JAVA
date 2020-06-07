import java.io.*;
class XYSTR {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String s = br.readLine();
            int pairs=0;
            for(int i=1;i<s.length();i++){
                if((s.charAt(i)=='x' && s.charAt(i-1)=='y')||(s.charAt(i)=='y' && s.charAt(i-1)=='x')){
                    pairs++;
                    i++;
                }
            }
            System.out.println(pairs);
        }
    }
}