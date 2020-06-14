package Practice.Begineer.TEMPLELA;

import java.io.*;
class TEMPLELA {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int [] nos = new int[n];
            boolean isPossible = true;
            if(line.length%2==1){
                int prev=0;
               for (int i = 0; i < line.length;i++) {
                    int a = Integer.parseInt(line[i]);   
                    if(i<=line.length/2){   
                        if(a!=prev+1){
                            isPossible=false;
                            break;
                        }else prev++;
                    }else{
                        if(a!=prev-1){
                            isPossible=false;
                            break;
                        }else prev--;
                    }
               }
            }else isPossible=false;
                        
            if(isPossible) System.out.println("yes");
            else System.out.println("no");
        }
    }
}