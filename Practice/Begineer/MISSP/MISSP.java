package Practice.Begineer.MISSP;

import java.io.*;
import java.util.ArrayList;
class MISSP{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> al = new ArrayList<>();
            for(int i=1;i<=n;i++){
                int num = Integer.parseInt(br.readLine());
                if(!al.isEmpty() && al.contains(num)){
                    al.remove(new Integer(num));
                }else
                al.add(num);
            }
            System.out.println(al.get(0));
        }
    }
}