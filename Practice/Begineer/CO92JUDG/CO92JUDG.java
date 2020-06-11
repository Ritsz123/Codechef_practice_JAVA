package Practice.Begineer.CO92JUDG;
import java.io.*;
import java.util.Arrays;
class CO92JUDG {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            String[] line1 = br.readLine().split(" ");
            String[] line2 = br.readLine().split(" ");
            int [] p1 = new int[n];
            int [] p2= new int[n];

            for(int i=0;i<n;i++){
                p1[i]=Integer.parseInt(line1[i]);
                p2[i]=Integer.parseInt(line2[i]);
            }

            Arrays.sort(p1);
            Arrays.sort(p2);
            int sum1=0;
            int sum2=0;
            for(int i=0;i<n-1;i++){
                sum1+=p1[i];
                sum2+=p2[i];
            }

            if(sum1==sum2) { System.out.println("Draw");}
            else 
            if(sum1<sum2){ System.out.println("Alice");}
            else 
            if(sum2<sum1){ System.out.println("Bob"); }
            
        }
    }
}