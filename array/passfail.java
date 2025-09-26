package array;

import java.util.Scanner;

public class passfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of student");
        int n=sc.nextInt();
        int[] y= new int[n];
        for (int i=0;i<n;i++){
            System.out.println("enter the value to student no "+(i+1));
            y[i]=sc.nextInt();
        }
        System.out.println("failed students are ");
        for(int i=0;i<n;i++){
            if(y[i]<35) System.out.println((i+1)+ "  ");
        }

    }
    
}
