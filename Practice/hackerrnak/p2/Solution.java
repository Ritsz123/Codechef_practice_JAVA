import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int count=0;
            
            System.out.println(count);
        }
    }
    static boolean isPrime(int n1,int n2) 
    { 
        // Corner cases 
        if (n1 <= 1) return false; 
        if (n1 <= 3) return true; 
      
        // This is checked so that we can skip  
        // middle five numbers in below loop 
        if (n1 % 2 == 0 || n1 % 3 == 0) return false; 
      
        for (int i = n1; i * i <= n2; i = i + 6) 
            if (n1 % i == 0 || n1 % (i + 2) == 0) 
            return false; 
      
        return true; 
    } 
}