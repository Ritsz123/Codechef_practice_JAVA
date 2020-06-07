import java.io.*;
class PRICECON{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] line = br.readLine().split(" ");
            String[] line2 = br.readLine().split(" ");
            int[] cost = new int[Integer.parseInt(line[0])];
            for(int i=0;i<Integer.parseInt(line[0]);i++){  
                cost[i]=Integer.parseInt(line2[i]);
            }
            int k = Integer.parseInt(line[1]);
            int loss=0;
            for(int i=0;i<cost.length;i++){
                if(cost[i]>k){
                    loss+=cost[i]-k;
                }
            }
            System.out.println(loss);
        }
    }
}