package Practice.Begineer.LOSTMAX;
import java.io.*;
import java.util.*;


class LOSTMAX {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());    
        while(t-->0){
            String[] line = br.readLine().split(" ");
            ArrayList<Integer> al = new ArrayList<>();
            for(int i=0;i<line.length;i++){
                al.add(Integer.parseInt(line[i]));
            }
            al.remove(new Integer(al.size()));
            al.sort(Collections.reverseOrder());
            System.out.println(al.get(0));
        }
    }
}