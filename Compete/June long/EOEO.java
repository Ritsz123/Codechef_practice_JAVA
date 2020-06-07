import java.io.*;
class EOEO {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            long ts = Long.parseLong(br.readLine());
            long count=0;
            for(int js=1;js<=ts;js++){
                while(js%2==0 && ts%2==0){
                    js=js/2;
                    ts=ts/2;
                    
                } 
                if(ts%2==1 && js%2==0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}