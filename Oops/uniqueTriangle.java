package Oops;

import java.util.Scanner;

public class uniqueTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;//=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            int k=i;
            for (int j = 1; j <= i; j++) {
                if (j%2==0){
                    k+=((2*n)-(2*i)+1);
                }
                else {

                }
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
