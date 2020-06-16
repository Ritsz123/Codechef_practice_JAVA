package Compete.CHEFRECP;

import java.util.*;
import java.io.*;
class Chefrecp {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            String [] line = br.readLine().split(" ");
            int[] nos = new int[line.length];
            ArrayList <Integer> q = new ArrayList<Integer>();
            ArrayList<Integer> repeats = new ArrayList<Integer>();
            for(int i=0;i<line.length;i++){
                nos[i]=Integer.parseInt(line[i]);
            }
            boolean isRepeat=false;
            int r=0;
            for(int i=1;i<n;i++){
                if(!q.isEmpty()){
                    if(q.contains(nos[i])){
                        isRepeat=true;
                        break;
                    }
                }
                if(nos[i-1]==nos[i]){
                    r++;   
                }else{
                    if(repeats.contains(r)){
                        isRepeat=true;
                        break;
                    }else{
                        repeats.add(r);
                        r=0;
                        q.add(nos[i-1]);
                    }
                    
                }
            }
            if(isRepeat){
                System.out.println("NO");
            }else System.out.println("YES");

        }
    }
}