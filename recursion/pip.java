package recursion;

import java.util.Scanner;

public class pip {
    public static void pip(int n){
        if(n==0) return;
        System.out.println("pre " + n);
        pip(n-1);
        System.out.println("in "+n);
        pip(n-1);
        System.out.println("post "+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        pip(a);

    }
}
