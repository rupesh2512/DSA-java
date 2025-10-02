package c.patternc;

import java.util.Scanner;

public class compositpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print((char)(j+65)+" ");
            }
            System.out.println();
        }
    }

}
