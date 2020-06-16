package Practice.Begineer.HS08TEST;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int withdraw = sc.nextInt();
        double totalTransaction = withdraw+0.50;
        double balance = sc.nextDouble();
        if((withdraw%5==0) &&  totalTransaction<balance){
            System.out.println(String.format("%.2f", balance-totalTransaction));
        }else{
            System.out.println(String.format("%.2f", balance));
        }
    }
}