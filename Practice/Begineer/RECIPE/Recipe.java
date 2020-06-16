package Practice.Begineer.RECIPE;

import java.util.*;
class Recipe {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] array = new int[n];
            for(int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }
            int ans = gcd(array[0], array[1]);
            for(int i=2;i<n;i++){
                ans= gcd(ans, array[i]);
            }
            for(int i=0;i<n;i++){
                System.out.print(array[i]/ans + " ");
            }
            System.out.println();
        }
        
    }   

    static int gcd(int a,int b){
        if(a==0)
        return b;
        if(b==0)
        return a;
        if(a<b){
            return gcd(a,b%a);
        }else
        return gcd(a%b, b);
    }
}