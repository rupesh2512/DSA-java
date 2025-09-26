package twoDimensionalArray;

import java.util.Scanner;

public class addTwoMatrix {
    public static void add(int a,int b, int[][] arra,int[][] arrb)
{
    int[][] arr3=new int[a][b];
    for(int i=0;i<arra.length;i++){
        for(int j=0;j<arrb.length;j++){
            arr3[i][j]=arra[i][j]+arrb[i][j];
        }
    }
    for(int i=0;i<arr3.length;i++){
    for(int j=0;j<arr3[0].length;j++){
        System.out.print("  "+arr3[i][j]);
    }
    System.out.println();
    }

} 
 public static void pri(int[][] arrx) {
    for(int i=0;i<arrx.length;i++){
        for (int j = 0; j <arrx[0].length; j++) {
            System.out.print(" "+arrx[i][j]);
        }
        System.out.println( " ");
    }
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("enter size of second matrix");
        int p=sc.nextInt();
        int q=sc.nextInt();
        int[][] arr2=new int[p][q];
        int[][] sum=new int[p][q];
        System.out.println("enter element to first array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter element to first array");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j]=sc.nextInt();
            }
        }
        if(n==p && m==q){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++){
                    sum[i][j]=arr[i][j]+arr2[i][j];

                }
            }
        System.out.println("'FIRST ONE IS '");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("second one is");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("and sum is \n");
        add(p,q,arr,arr2);
        pri(sum);
        }
        else System.out.println("addition not possible");
        
    }
}
