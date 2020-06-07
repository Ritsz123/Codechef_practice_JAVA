import java.io.BufferedReader;
import java.io.InputStreamReader;

class HEADBOB {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            if(s.contains("Y")){
                System.out.println("NOT INDIAN");
            }else if(s.contains("I")){
                System.out.println("INDIAN");
            }else{
                System.out.println("NOT SURE");
            }
        }
        
    }    
}