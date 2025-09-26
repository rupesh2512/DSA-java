package loops;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number to check: ");
        int n = sc.nextInt();
        int a = n,reverse=0,rem;
        while (a!=0){
            rem=a%10;
            reverse = reverse * 10 +rem;
            a/=10;
        }
        if(reverse==n){
            System.out.println(n+" is a palindrome number");
        }
        else System.out.println("not a palindrome ");
    }
    
}
