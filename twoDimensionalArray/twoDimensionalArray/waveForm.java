package twoDimensionalArray;

import java.util.Scanner;

public class waveForm {
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
                if(arr[i][j]<10){
                    System.out.print(arr[i][j]+"  ");
                }
                else System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter row and colum for your matrix");
        int n=sc.nextInt();
        int m= sc.nextInt();
        int[][] arr =new int[n][m];
        store(n, m, arr);
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                 for (int j =( arr.length-1); j >=0; j--) {
                    System.out.print(arr[j][i]+" ");
                }
            }
            if(i%2!=0){
                for (int j =0; j<arr.length; j++) {
                   System.out.print(arr[j][i]+" ");
               }
           }
        }
        System.out.println("\norignal is");
        print(arr, m, n);

    }
}
