package Practice.Begineer.FLOW009;


import java.io.*;
class Flow009{
    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String [] line = br.readLine().split(" ");
            int quantity = Integer.parseInt(line[0]);
            int price = Integer.parseInt(line[1]);
            
            float finalprice = quantity * price;
            if(quantity >1000){
                finalprice-= finalprice * 0.10;
            }
            System.out.println(String.format("%.6f", finalprice));
        }
    }
}