/**
 * C
 * odechef
 */
import java.io.*;
public class Codechef {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-->0) {
			int n = Integer.parseInt(br.readLine());
			String[] line = br.readLine().split(" ");
			long [] arr =new long[n];
			for (int i = 0; i < n; i++) {
				arr[i]=Long.parseLong(line[i]);
			}
			int sum=0;
			while(arr[0]!=0){	
				int tmp=arr.length;
				for (int i = 0; i < arr.length; i++) {
					if(arr[i]==0){
						tmp=i+1;
					}
				}
				for (int i = 0; i < tmp; i++) {
					arr[i]=arr[i]-1;
				}
				sum+=tmp;
			}
			System.out.println(sum);
		}
	}
}