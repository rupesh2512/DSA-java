package twoDimensionalArray;

import java.util.Scanner;

public class rotateBy90Degree {
    public static void store(int n, int m,int[][] arr){
        int k=1;
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=k;
                k++;

            }
        }
    }
    public static void print(int[][] arr,int m,int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void swap(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                int tem=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=tem;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and column ");
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] arr = new int[n][m];
        store(n,m,arr);
        print(arr, m, n);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                swap(arr);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int a=0,b=arr.length-1;
          while(a<b){
               int temp=arr[i][a];
               arr[i][a]=arr[i][b];
               arr[i][b]=temp;
               a++;b--;
            }
        }
        System.out.println("array after rotating ");
        print(arr, m, n);

    }
}
