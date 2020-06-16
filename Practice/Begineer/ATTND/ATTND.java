package Practice.Begineer.ATTND;

import java.io.*;


/**
 * ATTND
 */ 
class ATTND {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] names = new String[n];
            for (int i = 0; i < n; i++) {
                names[i] = br.readLine();
            }
            for (int i = 0; i < names.length; i++) {
                boolean isMore= false;
                for (int j = 0; j < names.length; j++) {
                    if(i!=j){
                        if(names[j].contains(names[i].split(" ")[0])){
                            isMore=true;
                        }
                    }
                }
                if (isMore) {
                    System.out.println(names[i]);
                }else System.out.println(names[i].split(" ")[0]);
            }
        }
    }
    
}