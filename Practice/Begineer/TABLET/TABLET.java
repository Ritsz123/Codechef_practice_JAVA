package Practice.Begineer.TABLET;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TABLET {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            long b = Long.parseLong(line[1]);
            long[][] tabs = new long[n][3];
            long maxsize=0;
            for(int i=0;i<n;i++){
                String[] line2 = br.readLine().split(" ");
                for(int j=0;j<3;j++){
					tabs[i][j] = Long.parseLong(line2[j]);
				}

                long sise = tabs[i][0] * tabs[i][1];
                if(sise>maxsize && tabs[i][2]<=b){
                    maxsize = sise;
                }
            }
            if(maxsize==0){
                System.out.println("no tablet");
            }else System.out.println(maxsize);

        }
    }
}