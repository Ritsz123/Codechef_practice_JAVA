import java.io.*;
class ATM2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t-->0){
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            int [] nos = new int[n];
            String op="";
            line = br.readLine().split(" ");
            for(int i=0;i<n;i++){
                nos[i]=Integer.parseInt(line[i]);
                if(nos[i]<=k){
                    k-=nos[i];
                    op+='1';
                }else{
                    op+='0';
                }
            }
            System.out.println(op);
        }
    }
}