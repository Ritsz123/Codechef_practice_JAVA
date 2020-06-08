import java.io.*;
class MOVIEWKN{
    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            String[] l1 = br.readLine().split(" ");
            String[] l2 = br.readLine().split(" ");
            
            int movie=0; int length=0; int rating=0; int index=0;
            for(int i=0;i<n;i++){
                int l = Integer.parseInt(l1[i]);
                int r = Integer.parseInt(l2[i]);
                if(l*r>movie){
                    movie=l*r;
                    index = i+1;
                    rating=r;
                }else if(l*r == movie){
                    if(r>rating){
                        rating=r;
                        index=i+1;
                    }
                }
            }
            System.out.println(index);
        }
    }
}