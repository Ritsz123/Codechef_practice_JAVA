import java.io.*;
class CANDY123 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            int limak=0;
            int bob=0;
            int win=0;
            for(int i=1;i>0;i++){
                if(i%2==1){
                    if((limak+i)>a){
                        win=2;
                        break;
                    }else limak+=i;
                }
                else{    
                    if((bob+i)>b){
                        win=1;
                        break;
                    }else bob+=i;
                }
            }

            if(win==1){
                System.out.println("Limak");
            }
            if(win==2){
                System.out.println("Bob");
            }
        }
    }
}