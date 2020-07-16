package Practice.Easy.LUCKYSTR;

/**
 * LUCKYSTR
 */
import java.io.*;
import java.util.ArrayList;
class LUCKYSTR {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);
        ArrayList<String> nList = new ArrayList<>();
        while (n--!=0) {
            nList.add(br.readLine());
        }
        while (k--!=0) {
            boolean isGood = false;
            String str = br.readLine();
            if(str.length()>=47){
                System.out.println("Good");
            }else{
                for (int i = 0; i < nList.size(); i++) {
                    if(str.contains(nList.get(i))){
                        isGood = true;
                    }
                }
                if(isGood) System.out.println("Good");
                else System.out.println("Bad");
            }
        }
    }
}