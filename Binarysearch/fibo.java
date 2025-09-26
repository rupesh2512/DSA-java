package Binarysearch;

import java.util.Scanner;


public class fibo {
    public static long fib(int x){
        if (x<=1) return x;
        else return fib(x-2)+fib(x-1);
        

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=100;
        System.out.println(fib(n));

    }
    
}
