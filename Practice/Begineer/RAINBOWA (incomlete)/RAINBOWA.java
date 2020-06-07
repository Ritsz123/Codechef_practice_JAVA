import java.io.*;
class RAINBOWA{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            String [] line = br.readLine().split(" ");
            int [] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(line[i]);
            }
            int i=0;
            int j=arr.length-1;
            int prev = arr[0];
            boolean isRainbow = true;
            for(i=0;i<=j;i++){
                if(arr[i]==prev || arr[i]==prev+1 || arr[i]==prev-1){
                    if(arr[i]!=arr[j]){
                        isRainbow=false;
                        break;
                    }
                    prev=arr[i];
                }else{
                    isRainbow=false;
                    break;
                }
               j--; 
            }
            if(isRainbow)
            System.out.println("yes");
            else
            System.out.println("no");
        }
    }
}