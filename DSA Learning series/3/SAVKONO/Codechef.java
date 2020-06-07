/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        
        Scanner sc = new Scanner(System.in);
        int testcases = Integer.parseInt(sc.nextLine());
        while(testcases-->0){
            int n = sc.nextInt();
            int z = sc.nextInt();
            Integer[] a = new Integer[n];
            int count=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            while(z>0 && a[0]!=0){
                Arrays.sort(a,Collections.reverseOrder());
                for(int i=0;i<n;i++){
                    if(z<=0 || a[i]==0){
                        break;
                    }
                    else{
                        z=z-a[i];
                        a[i]=a[i]/2;
                        count++;
                    }
                }
            }
            if(z>0){
                System.out.println("Evacuate");
            }else{
                System.out.println(count);
            }
            
        }
	}
}
