import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numofStalls = sc.nextInt();
        Integer [] profits = new Integer[numofStalls];
        for(int i=0;i<numofStalls;i++){
            profits[i]= sc.nextInt();
        }     

        //organise array
        

        int numofCustomers  = sc.nextInt();
        int totalprofits=0;
        for(int i=0;i<numofCustomers;i++){
            int n1= sc.nextInt();
            int n2= sc.nextInt();
            int p=0;
            while(n1!=n2){
                p +=profits[n1];
                n1++;
            }
            totalprofits+=p;
        }
        System.out.println(totalprofits);
    }
    
}