package Practice.Begineer.SIMDISH;
import java.io.*;
import java.util.ArrayList;
class SIMDISH {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());    
        while(t-->0){
            String[] s1 = br.readLine().split(" ");
            String[] s =br.readLine().split(" ");
            ArrayList<String> s2 = new ArrayList<>();
            for(String str : s){
                s2.add(str);
            }
            int count=0;
            for(int i=0;i<s1.length;i++){
                if(s2.contains(s1[i]))
                count++;
            }
            if(count>=(s1.length/2))
            System.out.println("similar");
            else System.out.println("dissimilar");
        }
    }
}