package c.patternc;

import java.util.Scanner;

public class startriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of n");
        int a=sc.nextInt();
        for(int i=0;i<=a;i++){
            for(int j=0;j<=i;j++){
                if((i%2)!=0)System.out.print((char)(j+65)+" ");
                else System.out.print(j+1+" ");
            }
            System.out.println( );
        }
    }
    
}
