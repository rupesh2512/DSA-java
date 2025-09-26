package loops;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1 :");
        int num1 = sc.nextInt();
        System.out.println("enter number 2 :");
        int num2 = sc.nextInt();
        int i=1,gcd=0;
        while (i <= num1 && i <= num2) {
            if (num1 % i == 0 && num2 % i == 0){
                 gcd = i;
            }
             i++;
        }
        System.out.println("gcd of two numbers is "+gcd);
    }
    
}
