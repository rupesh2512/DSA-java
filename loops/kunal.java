package loops;

import java.util.Scanner;

public class kunal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value to print ");
        // int n = sc.nextInt();
        int n=5;
        for(int i=1;i<=n;i++){
            int k=i-1;
            for (int j=1;j<=i;j++){
                System.out.print((k+=j) +" ");
            }
            System.out.println();
        }
        


    }
}
