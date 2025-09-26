package recursion;

import java.util.Scanner;

public class Maze {
    public static int maze(int m,int n){
        if(m==1||n==1) return 1;
        int right =maze(m,n-1);
        int left=maze(m-1,n);
        return left+right;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows and column");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(maze(m,n));
    }
}
