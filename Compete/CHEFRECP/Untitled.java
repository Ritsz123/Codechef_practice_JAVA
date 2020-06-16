package Compete.CHEFRECP;

import java.util.*;
class Untitled {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int num=sc.nextInt();
            int count=0;
            ArrayList<Integer> al = new ArrayList<>();
            ArrayList<Integer> counts = new ArrayList<>();
            boolean isRepeat = false;
            for(int i=1;i<n;i++){
                int temp = sc.nextInt();
                if(num==temp){
                    num=temp;
                    count++;
                }else{
                    if(!counts.isEmpty() && !al.isEmpty()){
                        if(counts.contains(count) || al.contains(num)){
                            isRepeat=true;
                            break;
                        }
                    }else{
                        counts.add(count);
                        al.add(num);
                        count=0;
                    }
                }
            }
            if(!isRepeat){
                System.out.println("NO");
            }else System.out.println("YES");

        }
    }
}