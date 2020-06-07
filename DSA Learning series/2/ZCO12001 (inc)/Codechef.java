
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
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(1);
		int maxsym=0;
		int nestingDepth=0;
		int position= 0;
		for(int i=0;i<n;i++){
			int num = sc.nextInt();
			if(num==1){
				stack.push(num);
			}
			if(num==2){
				if(!stack.isEmpty()){
					stack.pop();
				}
			}
			int size = stack.size();
			if(size>nestingDepth){
				nestingDepth=size;
				position=i+1;
			}
				
			if(stack.isEmpty())
				vector.add(i+1);
		}
		//maximum subsequence
		int maxlen=0;
		int posMaxseq=0;
		for(int i=0;i<vector.size()-1;i++){
			int len = vector.elementAt(i+1) - vector.elementAt(i);
			if(len>maxlen){
				maxlen=len;
				posMaxseq = vector.elementAt(i)+1;	
			}
			
		}
		System.out.print(nestingDepth + " "+ position+ " "+maxlen + " "+ posMaxseq);
	}
}
