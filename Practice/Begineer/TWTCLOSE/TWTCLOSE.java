import java.io.*;
import java.util.*;
class TWTCLOSE {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1;i<=k;i++){
            String[] str = br.readLine().split(" ");
            if(str[0].equals("CLICK")){
				int num = Integer.parseInt(str[1]);
                if(al.contains(num)){
                    al.remove(new Integer(num));
                }else{
                    al.add(num);
                }
            }
            else if (str[0].equals("CLOSEALL")){
                al.removeAll(al);
            }
            System.out.println(al.size());
        }
    }
}