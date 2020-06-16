package Practice.Begineer.INTEST;

import java.util.Scanner;

class Intest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count=0;
        while(n-->0){
            long num = sc.nextLong();
            if(num%k==0){
                count++;
            }
        }
        System.out.println(count);
    }
}