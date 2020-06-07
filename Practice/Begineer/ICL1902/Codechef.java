import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases-->0){
            int count=0;
            int n = sc.nextInt();
            while(n!=0){
                int sq = (int)Math.sqrt(n);
                count++;
                n=n-(sq*sq);
            }
            System.out.println(count);
        }
	}
}
