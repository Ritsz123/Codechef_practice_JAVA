package Practice.Begineer.FLOW014;

import java.util.*;

class FLOW014 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double hardness,carbon,tensile;
            hardness = sc.nextDouble();
            carbon = sc.nextDouble();
            tensile = sc.nextDouble();
            
            boolean cond1 =  hardness>50;
            boolean cond2 = carbon<0.7;
            boolean cond3 = tensile>5600;

            int grade=0;

            if(cond1 && cond2 && cond3)
            grade= 10;
            else if(cond1 && cond2)
            grade = 9;
            else if (cond2 && cond3)
            grade=8;
            else if(cond1 && cond3)
            grade= 7;
            else if (cond1 || cond2 || cond3)
            grade=6;
            else grade=5;

            System.out.println(grade);
        }
    }    
}