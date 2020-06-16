package Practice.Begineer.LUCKYFOUR;

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int num = sc.nextInt();
            int count=0;
            while(num!=0){
                if((num%10)==4){
                    count++;
                }
                num=num/10;
            }
            System.out.println(count);
        }
	}
}
