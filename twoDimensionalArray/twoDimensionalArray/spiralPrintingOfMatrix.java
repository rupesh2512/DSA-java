package twoDimensionalArray;

import java.util.Scanner;

public class spiralPrintingOfMatrix {
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
        Scanner sc=new Scanner(System.in);
        System.out.println("enter dimensions of matrix");
        int n= sc.nextInt();
        int m=sc.nextInt();
        int[][] arr = new int[n][m];
        store(n, m, arr);
        System.out.println("entered matrix is \n");
        print(arr, m, n);
        int minr=0,minc=0,k=0,maxr=n-1,maxc=m-1;
        while(minc<maxc || minr<maxr){
            for (int j = minc; j <=maxc; j++) {
                System.out.print(arr[minr][j]+" ");
                k++;
            }minr++;
            if(minr>maxr||minc>maxc) break;
            for (int j = minr; j <=maxr; j++) {
                System.out.print(arr[j][maxc]+" ");
                k++;
            }maxc--;
            if(minr>maxr||minc>maxc) break;
            for (int j = maxc; j >= minc; j--) {
                System.out.print(arr[maxr][j]+" ");
                k++;
            }maxr--;
            if(minr>maxr||minc>maxc) break;
            for (int j = maxr; j >= minr; j--) {
                System.out.print(arr[j][minc]+" ");
                k++;
            } minc++;
        }System.out.print(arr[n/2][m/2]);
    }
    
}
