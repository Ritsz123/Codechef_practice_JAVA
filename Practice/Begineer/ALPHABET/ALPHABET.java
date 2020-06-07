import java.io.*;
class ALPHABET {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int t= Integer.parseInt(br.readLine());
        while(t-->0){
            char[] str = br.readLine().toCharArray();
            boolean canRead = true;
            for(int i=0;i<str.length;i++){
                if(s.indexOf(str[i])>-1){
                    canRead=false;
                    break;
                }
            }
            if(canRead)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
    }
}