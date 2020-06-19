package Practice.Begineer.CODERLIF;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * CODERLIF
 */
class CODERLIF {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int count=0;
            String[] line = br.readLine().split(" ");
            boolean isBored =false;
            for (int i = 0; i < line.length; i++) {
                if (line[i].equals("1")) {
                    count++;
                    if (count==6) {
                        isBored=true;
                        break;
                    }
                }else if(line[i].equals("0")) count=0;
            }
            if (isBored) {
                System.out.println("#coderlifematters");
            } else {
                System.out.println("#allcodersarefun");
            }
         }
    }
}