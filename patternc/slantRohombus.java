package c.patternc;

import java.util.Scanner;

public class slantRohombus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of x");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
