package c.patternc;

import java.util.Scanner;

public class bridge {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n= sc.nextInt();
        for (int i=1;i<=2*n-1;i++){
            if (i<9) System.out.print(i+"  ");
            else System.out.print(i+"   ");
        }
        System.out.println();
        
        for (int i=1;i<=n;i++){
            for (int j=1;j<n+1-i;j++){
                System.out.print(j+"  ");
            }
            for(int j=1;j<=2*i-1;j++){
                if((n+j+i)<9) System.out.print("   ");
                else System.out.print("    ");
            }
            for(int j=1;j<n+1-i;j++){
                 System.out.print((n+j+i-1)+"   ");
                
            }
            System.out.println();
        }
    }
    
}
