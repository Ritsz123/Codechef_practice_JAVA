import java.io.*;
class hrnk1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            long num = Long.parseLong(br.readLine());
            int count=0;
            while(num!=0){
                if(num%10==0){
                    count++;
                    num=num/10;
                }else{
                    break;
                }
            }
            System.out.println(count);
        }
    }    
}