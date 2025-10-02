package c.patternc;

import java.util.Scanner;

public class trianglestar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int a = sc.nextInt();
        for(int i=0;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println( );
        }


    }
    
}
