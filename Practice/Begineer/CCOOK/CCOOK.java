
import java.io.*;
class CCOOK{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            String[] line = br.readLine().split(" ");
            int count=0;
            for(int i=0;i<line.length;i++){
                if(Integer.parseInt(line[i])==1)
                count++;
            }
            String pos="";
            switch(count){
                case 0: pos="Beginner"; break;
                case 1: pos="Junior Developer";break;
                case 2: pos = "Middle Developer"; break;
                case 3: pos = "Senior Developer";break;
                case 4: pos = "Hacker";break;
                case 5: pos= "Jeff Dean";
            }
            System.out.println(pos);
        }
    }
}