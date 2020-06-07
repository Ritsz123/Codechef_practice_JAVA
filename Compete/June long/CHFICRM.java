import java.io.*;
class CHFICRM{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int five=0;
            int ten=0;
            int fifteen=0;
            boolean isPossible =true;
            for(int i=0;i<line.length;i++){
                int c = Integer.parseInt(line[i]);
                if(c==5){
                    five++;
                }else if(c==10){
                    if(five>=1){
                        ten++;
                        five--;
                    }
                    else{
                        isPossible=false;
                        break;
                    }
                }else if(c==15){
                    if(ten>=1){
                        ten--;
                        fifteen++;    
                    }else if(five>=2){
                        five-=2;
                        fifteen++;
                    }
                    else{
                        isPossible=false;
                        break;
                    }
                }
            }
            if(isPossible){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}