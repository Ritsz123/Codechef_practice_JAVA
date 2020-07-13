package Practice.Easy.RRSTONE;


/**
 * RRSTONE
 */

    //the problem statement is such that it hides something
    // i.e the  array will always repeat after 2 try i.e array will be same as when k=1 & k=3
    // so if k i even consider k=2 if k i odd consider k=1
    import java.io.*;
    class RRSTONE {
    
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            long k = Long.parseLong(line[1]);
            String[] line1 = br.readLine().split(" ");
            long [] arr= new  long[n];
            long max=Long.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                arr[i]=Long.parseLong(line1[i]);
            }
            
            if(k==0){
                k=0;
            }else if(k%2==1){
                k=1;
            }else if(k%2==0){
                k=2;
            }
            
            for (int i = 1; i <= k; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if(arr[j]>max) max= arr[j];
                }
                for (int j = 0; j < arr.length; j++) {
                    arr[j]=max-arr[j];    
                }
            }
            for (long l : arr) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }