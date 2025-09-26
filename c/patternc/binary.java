package c.patternc;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class binary {
    public static void main(String[] args) {
        Scanner ku=new Scanner(System.in);
        System.out.println("enter the value of n");
        int a=ku.nextInt();
        for(int i=1;i<a;i++){
            for(int j=1;j<=a;j++){
                if(i+j>a) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }


    }
    
}
