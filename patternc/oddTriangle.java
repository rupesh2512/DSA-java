package c.patternc;

import java.util.Scanner;

public class oddTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int a=sc.nextInt();
        int c=1;
        for(int i=1;i<a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c++ +" ");
               
            }
            System.out.println();
        }
    }
    
}
