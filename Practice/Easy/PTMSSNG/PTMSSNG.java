package Practice.Easy.PTMSSNG;

/**
 * PTMSSNG
 */

//  BASIC rule in every rectangle 4 point a,b,c,d  a[x] is equal to b[x] and b[y] is equal to c[y] respectively
//  basically we have to check how many times each x & y appears in input 
// The x and y which appears odd times in input is answer

import java.io.*;
import java.util.HashSet;
class PTMSSNG {

    public static void main(String[] args) throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t--!=0) {
            int n = Integer.parseInt(br.readLine());
            int total = (4*n)-1;
            HashSet<Integer> aX = new HashSet<>();
            HashSet<Integer> aY = new HashSet<>();

            for (int i = 0; i < total ; i++) {
                String[] line = br.readLine().split(" ");
                int x = Integer.parseInt(line[0]);
                int y = Integer.parseInt(line[1]);
                
                if(!aX.isEmpty() && aX.contains(x)){
                    aX.remove(new Integer(x));
                }else{
                    aX.add(x);
                }

                if(!aY.isEmpty() && aY.contains(y)){
                    aY.remove(new Integer(y));
                }else{
                    aY.add(y);
                }
            }
            System.out.println(aX.iterator().next() +" " + aY.iterator().next());
        }
    }
}