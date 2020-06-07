import java.io.*;
class CHEFSTLT {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int t = Integer.parseInt(br.readLine());
       while(t-->0){
           char[] s1 = br.readLine().toCharArray();
           char[] s2 = br.readLine().toCharArray();
           int mindiff=s1.length;
           int maxdiff=0;
           for(int i=0;i<s1.length;i++){
               if(s1[i]=='?' || s2[i]=='?'){
                   mindiff--;
                   maxdiff++;
                }else if(s1[i]==s2[i]){
                    mindiff--;
                }else{
                    maxdiff++;
                }

            }
           System.out.println(mindiff + " " + maxdiff);
        }
    }
    
}