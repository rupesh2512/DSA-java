package c.patternc;

import java.util.Scanner;

public class plusStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        int n=sc.nextInt();
        int mid=(n/2)+1;
        System.out.println(""+mid);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==mid||i==mid){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
